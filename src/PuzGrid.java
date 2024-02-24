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
        //loop for testing purposes, should be commented out before submission
        for (int i = 0; i < gSolution.size(); i++) {
            selections.get(gSolution.get(i)).toggle();
            selected++;
            labels.get(gSolution.get(i)).setBackground(Color.GREEN);
        }
    }

    public int getGSize() {
        return size;
    }
    public int getSelected() {
        return selected;
    }
    public ArrayList<Integer> getSolutions() {
        return solutions;
    }
    public ArrayList<String> getCatX() {
        return catX;
    }
    public ArrayList<String> getCatY() {
        return catY;
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
                //selected = (selected == 0) ? i : 0;
                break;
            }
        }
    }
    /**
     * Compares this Object to another.
     * @param o Object to be compared
     * @return true if Object o is the same as this Object
     */
    @Override
    public boolean equals(Object o) {
        if(super.equals(o) && getClass() == o.getClass()) {
            if(size == ((PuzGrid) o).getGSize() && selected == ((PuzGrid) o).getSelected() && solutions.equals(((PuzGrid) o).getSolutions()) && catX.equals(((PuzGrid) o).getCatX()) && catY.equals(((PuzGrid) o).getCatY())) {
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
        String result = "Grid size: " + size + "\nCat1 displays: ";
        for(int i = 0; i < catX.size(); i++) {
            result += catX.get(i);
            if(i < catX.size() - 1) {
                result += ", ";
            }
        }
        result += "\nCat2 displays";
        for(int i = 0; i < catY.size(); i++) {
            result += catY.get(i);
            if(i < catY.size() - 1) {
                result += ", ";
            }
        }
        result += "\nSolution indices: ";
        for(int i = 0; i < solutions.size(); i++) {
            result += solutions.get(1);
            if(i < solutions.size() - 1) {
                result += ", ";
            }
        }
        return result;
    }
}
