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
        categories = nCat;
        items = nItem;
        grids = new ArrayList<>();
        hints = new ArrayList<>();
    }
    //getters and setters for use by subclasses
    public String getClues() {
        return clues;
    }
    public int getCategories() {
        return categories;
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
    /**
     * Compares this Object to another.
     * @param o Object to be compared
     * @return true if Object o is the same as this Object
     */
    @Override
    public boolean equals(Object o) {
        if(super.equals(o) && getClass() == o.getClass()) {
            if(categories == ((Puzzle) o).getCategories() && items == ((Puzzle) o).getItems() && clues.equals(((Puzzle) o).getClues()) && grids.equals(((Puzzle) o).getGrids())) {
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
        String result = categories + " X " + items + " puzzle.\nContains Grids:";
        for(PuzGrid grid : grids) {
            result += "\n" + grid.toString();
        }
        return result;
    }
}
