import java.util.ArrayList;
/**
 * A subclass of Puzzle. Loads a 3 X 4 puzzle with 3 grids and very basic categories
 * The answers are:
 * @author Jonathan Murphy, Salim Jday
 * @version 1.0
 */
public class SamplePuzzle extends Puzzle {
    //Attributes
    private ArrayList<String> cat1, cat2, cat3;

    //Constructor
    public SamplePuzzle() {
        super(3, 4);
        cat1 = new ArrayList<>();
        cat2 = new ArrayList<>();
        cat3 = new ArrayList<>();

        cat1.add("A");
        cat1.add("B");
        cat1.add("C");
        cat1.add("D");

        cat2.add("1");
        cat2.add("2");
        cat2.add("3");
        cat2.add("4");

        cat3.add("a");
        cat3.add("b");
        cat3.add("c");
        cat3.add("d");

        ArrayList<Integer> sol1 = new ArrayList<>();
        sol1.add(0);
        sol1.add(1);
        sol1.add(2);
        sol1.add(3);

        ArrayList<Integer> sol2 = new ArrayList<>();
        sol2.add(1);
        sol2.add(2);
        sol2.add(3);
        sol2.add(0);

        ArrayList<Integer> sol3 = new ArrayList<>();
        sol3.add(2);
        sol3.add(3);
        sol3.add(0);
        sol3.add(1);

        PuzGrid grid1 = new PuzGrid(4, sol1, cat1, cat2);
        PuzGrid grid2 = new PuzGrid(4, sol2, cat1, cat3);
        PuzGrid grid3 = new PuzGrid(4, sol3, cat2, cat3);

        super.addGrid(grid1);
        super.addGrid(grid2);
        super.addGrid(grid3);

        super.setClues("Sample clues for the puzzle.");

        super.addHint("Sample hint 1");
        super.addHint("Sample hint 2");
    }
    /**
     * Basic getter.
     * @return attribute ArrayList<String> cat1
     */
    public ArrayList<String> getCat1() {
        return cat1;
    }
    /**
     * Basic getter.
     * @return attribute ArrayList<String> cat2
     */
    public ArrayList<String> getCat2() {
        return cat2;
    }
    /**
     * Basic getter.
     * @return attribute ArrayList<String> cat3
     */
    public ArrayList<String> getCat3() {
        return cat3;
    }

    @Override
    public boolean checkSelect() {
        for (PuzGrid grid : super.getGrids()) {
            if (!grid.checkSelect()) {
                return false;
            }
        }
        return true;
    }
    /**
     * Compares this Object to another.
     * @param o Object to be compared
     * @return true if Object o is the same as this Object
     */
    @Override
    public boolean equals(Object o) {
        if(super.equals(o) && getClass() == o.getClass()) {
            if(cat1.equals(((SamplePuzzle) o).getCat1()) && cat2.equals(((SamplePuzzle) o).getCat2()) && cat3.equals(((SamplePuzzle) o).getCat3())) {
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
        return "SamplePuzzle: " + super.toString();
    }
}