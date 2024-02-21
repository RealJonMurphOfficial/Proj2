import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 * Placeholder comment.
 * Add your name under author after working on this class.
 * @author Jonathan Murphy, Salim Jday,
 */
public class SelectBox extends JPanel {
    //Attributes
    private boolean selected;
    private int id;
    private JButton button;

    //Constructor
    public SelectBox(int i) {
        selected = false;
        id = i;

        button = new JButton();
        button.setBackground(Color.WHITE);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selected = !selected;
                button.setBackground(selected ? Color.GREEN : Color.WHITE);
            }
        });

        add(button);
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
        button.setBackground(selected ? Color.GREEN : Color.WHITE);
    }
}
