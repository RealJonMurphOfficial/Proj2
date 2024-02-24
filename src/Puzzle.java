import java.util.ArrayList;
/**
 * This abstract class represents a puzzle.
 * Placeholder comment.
 * Add your name under author after working on this class.
 * @author Jonathan Murphy, Ian Chung, Salim Jday
 * @version 1.0
 */
public abstract class Puzzle {
    //Attributes
    private int categories, items;
    private String clues;
    private ArrayList<PuzGrid> grids;
    private ArrayList<String> hints;
    //Methods

    /**
     * Default Constructor.
     * Initializes the puzzle with default values.
     */
    public Puzzle() {
        categories = 0;
        items = 0;
        clues = "";
        grids = new ArrayList<>();
        hints = new ArrayList<>();
    }
    /**
     * Constructor.
     * Initializes the puzzle with specified categories and items.
     * @param nCat Number of categories
     * @param nItem Number of items
     */
    public Puzzle(int nCat, int nItem) {
        categories = nCat;
        items = nItem;
        grids = new ArrayList<>();
        hints = new ArrayList<>();
    }
    //getters and setters for use by subclasses

    /**
     * Getter for clues attribute.
     * @return The clues of the puzzle
     */
    public String getClues() {
        return clues;
    }

    /**
     * Getter for categories attribute.
     * @return The number of categories in the puzzle
     */
    public int getCategories() {
        return categories;
    }

    /**
     * Getter for items attribute.
     * @return The number of items in the puzzle
     */
    public int getItems() {
        return items;
    }

    /**
     * Retrieves the list of grids associated with this puzzle.
     * @return An ArrayList containing the grids of the puzzle
     */
    public ArrayList<PuzGrid> getGrids() {
        return grids;
    }

    /**
     * Retrieves a hint from the list of hints.
     * If no hints are available, returns a default message.
     * @return A hint if available, otherwise a default message
     */
    public String showHint() {
        if (hints.isEmpty()) {
            return "No hints available.";
        }
        String hint = hints.get(0);
        hints.remove(0);
        return hint;
    }

    /**
     * Sets the clues for this puzzle.
     * @param cList The clues to be set
     */
    public void setClues(String cList) {
        clues = cList;
    }

    /**
     * Adds a grid to the list of grids.
     * @param grid The grid to be added
     */
    public void addGrid(PuzGrid grid) {
        grids.add(grid);
    }

    /**
     * Adds a hint to the list of hints.
     * @param hint The hint to be added
     */
    public void addHint(String hint) {
        hints.add(hint);
    }

    /**
     * Abstract method to be implemented by subclasses.
     * Checks whether a selection is correct.
     * @return true if the selection is correct, otherwise false
     */
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