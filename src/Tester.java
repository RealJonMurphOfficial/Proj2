import javax.swing.*;
/**
 * Placeholder comment.
 * Add your name under author after working on this class.
 * @author Jonathan Murphy, Salim Jday,
 */
public class Tester {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Sample Puzzle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Puzzle puzzle = new SamplePuzzle();
        PuzPane pane = new PuzPane(puzzle);

        frame.getContentPane().add(pane);

        frame.pack();
        frame.setVisible(true);
    }
}