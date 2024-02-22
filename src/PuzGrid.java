import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
/**
 * Placeholder comment.
 * Add your name under author after working on this class.
 * @author Jonathan Murphy, Salim Jday,
 */
public class PuzGrid extends JPanel implements ActionListener {
    //Attributes
    private int size, selected;
    private ArrayList<Integer> solutions;
    private ArrayList<SelectBox> selections;
    private ArrayList<String> catX, catY;
    private ArrayList<JTextField> labels;

    //Constructor
    public PuzGrid(int gSize, ArrayList<Integer> gSolution, ArrayList<String> cat1, ArrayList<String> cat2) {
        size = gSize;
        selected = 0;//number of boxes selected
        solutions = gSolution;
        catX = cat1;
        catY = cat2;
        selections = new ArrayList<>();
        labels = new ArrayList<>();

        setLayout(new GridLayout(size, size));

        for (int i = 0; i < (size * size); i++) {
            JTextField label = new JTextField();
            label.setEditable(false);
            label.setHorizontalAlignment(JTextField.CENTER);
            label.setText(catX.get(i / size) + " - " + catY.get(i % size));
            labels.add(label);
            add(label);

            SelectBox selectBox = new SelectBox(i);
            selections.add(selectBox);
            add(selectBox.getButton());
            selections.get(i).getButton().addActionListener(this);
        }

        for (int i = 0; i < gSolution.size(); i++) {
            selections.get(gSolution.get(i)).toggle();
            labels.get(gSolution.get(i)).setBackground(Color.GREEN);
        }
    }

    public boolean checkSelect() {
        if (size != selected) {
            return false;
        }
        for (Integer i : solutions) {
            if (!selections.get(i).isSelected()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        for (int i = 0; i < selections.size(); i++) {
            if (event.getSource().equals(selections.get(i).getButton())) {
                if(selections.get(i).toggle()) {
                    selected++;
                }
                else {
                    selected--;
                }
                labels.get(i).setBackground(selections.get(i).isSelected() ? Color.GREEN : Color.WHITE);
                //selected = (selected == 0) ? i : 0;//
                break;
            }
        }
    }
}