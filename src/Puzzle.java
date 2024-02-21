import java.util.ArrayList;
/**
 * Placeholder comment.
 * Add your name under author after working on this class.
 * @author Jonathan Murphy, Ian Chung
 */
public abstract class Puzzle {
    //Attributes
    private int categories, items;
    private ArrayList<String> clues;
    private ArrayList<PuzGrid> grids;
    private ArrayList<String> hints;
    //Methods
    public Puzzle(int nCat, int nItem) {
        //set nCat to categories and nItem to items
        this.categories = nCat;
        this.items = nItem;
        clues = new ArrayList<>();
        grids = new ArrayList<>();
        hints = new ArrayList<>();
    }
    //getters and setters for use by subclasses
    public ArrayList<String> getClues() {
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
    public void setClues(String clue) {
        clues.add(clue);
    }
    public void addGrid(PuzGrid grid) {
        //add grid to grids
        grids.add(grid);
    }
    public void addHint(String hint) {
        //add hint to hints
        hints.add(hint);
    }
    public abstract boolean checkSelect();
  */
    public boolean checkSelect(){
      for (PuzGrid grid: grids){
          if (!grid.checkSelect()){
              return false;
          }
      }
  */
}
