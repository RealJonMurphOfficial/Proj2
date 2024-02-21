import javax.swing.*;
/**
 * Placeholder comment.
 * Add your name under author after working on this class.
 * @author Jonathan Murphy, Ian Chung
 */
public class SelectBox {
    //Attributes
    private boolean selected;
    private int id;
    private JButton button;
    //Methods
    public SelectBox(int id) {
        this.id = id;
        selected = false;
        button = new JButton();
        //this(42);
    }
    public SelectBox(int i) {
        selected = false;
        id = i;
        button = new JButton();
    }
    public boolean isSelected() {
        return selected;
    }
    public void setSelected(boolean selected){
        this.selected = selected;
    }
    public int getId() {
        return id;
    }
    public JButton getButton() {
        return button;
    }
    public boolean toggle() {
        selected = !selected;
        //cosmetic change too, change color of button depending on selected or not
        return selected;
    }
}
