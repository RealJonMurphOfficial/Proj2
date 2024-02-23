import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
/**
 * A JPanel that contains a basic puzzle game.
 * Loads a Puzzle object containing a number of grids of toggleable buttons.
 * Allows the user to request hints and check their answers at the push of a button
 * @author Jonathan Murphy, Salim Jday,
 * @version 1.0
 */
public class PuzPane extends JPanel implements ActionListener {
    //Attributes
    private Puzzle puzzle;
    private JButton hint, finish;
    private JTextField clues;
    //Methods
    /**
     * Default constructor. Passes a new SamplePuzzle to the primary constructor.
     */
    public PuzPane() {
        this(new SamplePuzzle());
    }
    /**
     * Primary constructor. Places clue textField and the hint and finish buttons on the panel.
     * Accepts a Puzzle subclass and displays its PuzGrid panels on the primary panel for proper use.
     * @param p Puzzle subclass set to puzzle attribute
     */
    public PuzPane(Puzzle p) {
        puzzle = p;

        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout());

        clues = new JTextField(puzzle.getClues());
        clues.setEditable(false);
        topPanel.add(clues);

        hint = new JButton("Hint");
        hint.addActionListener(this);
        /*hint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String hint = puzzle.showHint();
                JOptionPane.showMessageDialog(null, hint);
            }
        });*/
        topPanel.add(hint);

        finish = new JButton("Finish");
        finish.addActionListener(this);
        /*finish.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (puzzle.checkSelect()) {
                    JOptionPane.showMessageDialog(null, "Congratulations! You've solved the puzzle.");
                } else {
                    JOptionPane.showMessageDialog(null, "Please try again.");
                }
            }
        });*/
        topPanel.add(finish);

        add(topPanel, BorderLayout.NORTH);

        ArrayList<PuzGrid> grids = puzzle.getGrids();
        JPanel gPane = new JPanel();
        int gSize = puzzle.getItems() - 1;
        gPane.setLayout(new GridLayout(gSize, gSize));
        for(PuzGrid grid : grids) {
            gPane.add(grid);
        }
        add(gPane, BorderLayout.CENTER);
        /*add(grids.get(0), BorderLayout.WEST);
        add(grids.get(1), BorderLayout.CENTER);
        add(grids.get(2), BorderLayout.EAST);*/
        /*for (PuzGrid grid : grids) {
            add(grid, BorderLayout.CENTER);
        }*/
    }
    /**
     * Basic getter.
     * @return attribute Puzzle puzzle
     */
    public Puzzle getPuzzle() {
        return puzzle;
    }
    /**
     * Recieves input from hint or finish buttons and displays a message on a JOptionPane.
     * When hint is pressed, calls Puzzle.showHint() and displays the result.
     * When finish is pressed, uses Puzzle.checkSelect() to determine if the answer is correct and gives proper feedback.
     * @param event input from ActionListener
     */
    public void actionPerformed(ActionEvent event) {
        if(event.getSource().equals(hint)) {
            String hint = puzzle.showHint();
            JOptionPane.showMessageDialog(null, hint);
        }
        else if(event.getSource().equals(finish)) {
            if (puzzle.checkSelect()) {
                JOptionPane.showMessageDialog(null, "Congratulations! You've solved the puzzle.");
            } else {
                JOptionPane.showMessageDialog(null, "Please try again.");
            }
        }
    }
    /**
     * Compares this Object to another.
     * @param o Object to be compared
     * @return true if Object o is the same as this Object
     */
    @Override
    public boolean equals(Object o) {
        if(super.equals(o) && getClass() == o.getClass()) {
            if(puzzle.equals(((PuzPane) o).getPuzzle())) {
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
        return "Displaying Puzzle: " + puzzle.toString();
    }
}