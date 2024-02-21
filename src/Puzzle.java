import java.util.ArrayList;
/**
 * Placeholder comment.
 * Add your name under author after working on this class.
 * @author Jonathan Murphy, Salim Jday,
 */
public abstract class Puzzle {
    //Attributes
    private int categories, items;
    private String clues;
    private ArrayList<PuzGrid> grids;
    private ArrayList<String> hints;

    //Constructor
    public Puzzle(int nCat, int nItem) {
        categories = nCat;
        items = nItem;
        clues = "";
        grids = new ArrayList<>();
        hints = new ArrayList<>();
    }

    public String getClues() {
        return clues;
    }

    public int getItems() {
        return items;
    }

    public ArrayList<PuzGrid> getGrids() {
        return grids;
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

    public String showHint() {
        if (hints.isEmpty()) {
            return "No hints available.";
        }
        String hint = hints.get(0);
        hints.remove(0);
        return hint;
    }
}
