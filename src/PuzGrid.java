import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
/**
 * Placeholder comment.
 * Add your name under author after working on this class.
 * @author Jonathan Murphy,
 */
public class PuzGrid extends JPanel implements ActionListener {
    //Attributes
    private int size, selected;
    private ArrayList<Integer> solutions;
    private ArrayList<SelectBox> selections;
    private ArrayList<String> catX, catY;
    private ArrayList<JTextField> labels;
    //Methods
    public PuzGrid(int gSize, ArrayList<Integer> gSolution, ArrayList<String> cat1, ArrayList<String> cat2) {
        size = gSize;
        selected = 0;
        solutions = gSolution;
        catX = cat1;
        catY = cat2;
        selections = new ArrayList<>();
        labels = new ArrayList<>();
        for(int i = 0; i < (size * size); i++) {
            selections.add(new SelectBox(i));
            //set positions of buttons: selections.get(i).getButton()
        }
    }
    public boolean checkSelect() {
        if(size != selected){
            return false;
        }
        for(Integer i : solutions) {
            if(!selections.get(i).isSelected()) {
                return false;
            }
        }
        return true;
    }
    public void actionPerformed(ActionEvent event) {
        //
    }
}
