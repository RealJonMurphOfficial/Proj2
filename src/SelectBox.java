import javax.swing.*;
import java.awt.*;
/**
 * Represents the selectable box of the puzzle grid.
 * Allows toggling the selection and updateing the button's color accordingly.
 * @author Jonathan Murphy, Salim Jday, Ian Chung
 */
public class SelectBox {
    //Attributes
    private boolean selected;
    private int id;
    private JButton button;
    //Methods
    public SelectBox() {
        this(42);
    }
    public SelectBox(int i) {
        selected = false;
        id = i;
        button = new JButton("" + i);
    }
    //Getters
    public boolean isSelected() {
        return selected;
    }
    public int getId() {
        return id;
    }
    public JButton getButton() {
        return button;
    }
    //Toggles and updates the button color.
    public boolean toggle() {
        selected = !selected;
        button.setBackground(selected ? Color.GREEN : Color.WHITE);
        return selected;
    }
    /**
     * Compares this Object to another.
     * @param o Object to be compared
     * @return true if Object o is the same as this Object
     */
    @Override
    public boolean equals(Object o) {
        if(super.equals(o) && getClass() == o.getClass()) {
            if(selected == ((SelectBox) o).isSelected() && id == ((SelectBox) o).getId() && button.equals(((SelectBox) o).getButton())) {
                return true;
            }
        }
        return false;
    }
    /**
     * Returns a String containing information regarding the object's attributes.
     * @return String listing object's key attributes
     */
    @Override
    public String toString() {
        String result = "SelectBox ID: " + id;
        if(selected) {
            result += ", selected";
        }
        else {
            result += ", not selected";
        }
        return result;
    }
}
