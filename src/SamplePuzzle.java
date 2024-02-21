import java.util.ArrayList;
/**
 * Placeholder comment.
 * Add your name under author after working on this class.
 * @author Jonathan Murphy,
 */
public class SamplePuzzle extends Puzzle{
    //Attributes
    private ArrayList<String> cat1, cat2, cat3;
    //Methods
    public SamplePuzzle() {
        super(3, 4);
        cat1 = new ArrayList<>();
        cat2 = new ArrayList<>();
        cat3 = new ArrayList<>();
        //add to cat lists
        super.setClues("Sample Text");
        ArrayList<Integer> sol1 = new ArrayList<>();
        ArrayList<Integer> sol2 = new ArrayList<>();
        ArrayList<Integer> sol3 = new ArrayList<>();
        //determine + add to solLists
        super.addGrid(new PuzGrid(4, sol1, cat1, cat2));
        super.addGrid(new PuzGrid(4, sol2, cat1, cat3));
        super.addGrid(new PuzGrid(4, sol3, cat2, cat3));
        //determine hints and add a few
        super.addHint("Sample Text");
    }
    public boolean checkSelect() {
        for(PuzGrid grid : super.getGrids()) {
            if(!grid.checkSelect()) {
                return false;
            }
        }
        return true;
    }
}