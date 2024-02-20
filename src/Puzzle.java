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
        //set nCat to categories and nItem to items
    }
    //getters and setters for use by subclasses
    public String getClues() {
        return clues;
    }
    public int getItems() {
        return items;
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
        //add grid to grids
    }
    public void addHint(String hint) {
        //add hint to hints
    }
    public abstract boolean checkSelect();
}