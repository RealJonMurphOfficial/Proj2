import javax.swing.*;
import java.awt.*;
/**
 * Placeholder comment.
 * Add your name under author after working on this class.
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
    public boolean isSelected() {
        return selected;
    }
    public int getId() {
        return id;
    }
    public JButton getButton() {
        return button;
    }
    public boolean toggle() {
        selected = !selected;
        button.setBackground(selected ? Color.GREEN : Color.WHITE);
        return selected;
    }
    @Override
    public boolean equals(Object o) {
        if(super.equals(o) && getClass() == o.getClass()) {
            if(selected == ((SelectBox) o).isSelected() && id == ((SelectBox) o).getId() && button.equals(((SelectBox) o).getButton())) {
                return true;
            }
        }
        return false;
    }
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