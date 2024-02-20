import java.util.ArrayList;
/**
 * Placeholder comment.
 * Add your name under author after working on this class.
 * @author Jonathan Murphy,
 */
public abstract class Puzzle {
    //Attributes
    private int categories, items;
    private String clues;
    private ArrayList<PuzGrid> grids;
    private ArrayList<String> hints;
    //Methods
    public Puzzle(int nCat, int nItem) {
        //
    }
    public String getClues() {
        return clues;
    }
    public ArrayList<PuzGrid> getGrids() {
        return grids;
    }
    public String showHint() {
        return "take remove hint from hints";
    }
    public void setClues(String cList) {
        clues = cList;
    }
    public void addGrid(PuzGrid grid) {
        //
    }
    public void addHint(String hint) {
        //
    }
    public abstract boolean checkSelect();
}