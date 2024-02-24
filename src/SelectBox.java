import javax.swing.*;
import java.awt.*;
/**
 * Represents the selectable box of the puzzle grid.
 * Allows toggling the selection and updating the button's color accordingly.
 * Provides a visual representation of a selectable box in the grid.
 * @author Jonathan Murphy, Salim Jday, Ian Chung
 * @version 1.0
 */
public class SelectBox {
    //Attributes
    private boolean selected;
    private int id;
    private JButton button;
    //Methods
    /**
     * Default constructor.
     * Passes int value 42 to the primary constructor.
     */
    public SelectBox() {
        this(42);
    }
    /**
     * Primary constructor.
     * Creates a new selectable box with the specified ID.
     * @param i The ID of the selectable box.
     */
    public SelectBox(int i) {
        selected = false;
        id = i;
        button = new JButton("" + i);
    }
    //Getters
    /**
     * Basic getter.
     * @return the selection state of the box. True if the box is selected, false otherwise.
     */
    public boolean isSelected() {
        return selected;
    }
    /**
     * Basic getter.
     * @return The ID of the box.
     */
    public int getId() {
        return id;
    }
    /**
     * Basic getter.
     * @return The button representing the box.
     */
    public JButton getButton() {
        return button;
    }
    /**
     * Toggles and updates the button color.
     * @return The updated selection state of the box.
     */
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