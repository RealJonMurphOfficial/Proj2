import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
/**
 * Placeholder comment.
 * Add your name under author after working on this class.
 * @author Jonathan Murphy, Salim Jday,
 */
public class PuzPane extends JPanel implements ActionListener {
    //Attributes
    private Puzzle puzzle;
    private JButton hint, finish;
    private JTextField clues, event;

    //Constructor
    public PuzPane(Puzzle puzzle) {
        this.puzzle = puzzle;

        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout());

        clues = new JTextField(puzzle.getClues());
        clues.setEditable(false);
        topPanel.add(clues);

        hint = new JButton("Hint");
        hint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String hint = puzzle.showHint();
                JOptionPane.showMessageDialog(null, hint);
            }
        });
        topPanel.add(hint);

        finish = new JButton("Finish");
        finish.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (puzzle.checkSelect()) {
                    JOptionPane.showMessageDialog(null, "Congratulations! You've solved the puzzle.");
                } else {
                    JOptionPane.showMessageDialog(null, "Please try again.");
                }
            }
        });
        topPanel.add(finish);

        add(topPanel, BorderLayout.NORTH);

        ArrayList<PuzGrid> grids = puzzle.getGrids();
        for (PuzGrid grid : grids) {
            add(grid, BorderLayout.CENTER);
        }
    }
    public void actionPerformed(ActionEvent event) {
        //
    }
}