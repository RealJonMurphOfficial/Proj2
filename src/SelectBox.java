import javax.swing.*;
/**
 * Placeholder comment.
 * Add your name under author after working on this class.
 * @author Jonathan Murphy,
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
        button = new JButton();
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
    public void toggle() {
        selected = !selected;
        //cosmetic change too
    }
}