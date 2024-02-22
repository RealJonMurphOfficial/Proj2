import java.util.ArrayList;
/**
 * Placeholder comment.
 * Add your name under author after working on this class.
 * @author Jonathan Murphy, Ian Chung, Salim Jday
 */
public abstract class Puzzle {
    //Attributes
    private int categories, items;
    private String clues;
    private ArrayList<PuzGrid> grids;
    private ArrayList<String> hints;
    //Methods
    public Puzzle(int nCat, int nItem) {
        this.categories = nCat;
        this.items = nItem;
        grids = new ArrayList<>();
        hints = new ArrayList<>();
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
        if (hints.isEmpty()) {
            return "No hints available.";
        }
        String hint = hints.get(0);
        hints.remove(0);
        return hint;
    }
    public void setClues(String cList) {
        clues = cList;
    }
    public void addGrid(PuzGrid grid) {
        grids.add(grid);
    }
    public void addHint(String hint) {
        hints.add(hint);
    }
    public abstract boolean checkSelect();
}