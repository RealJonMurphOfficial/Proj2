import javax.swing.*;
/**
 * Tester class/main method for PuzPane and Puzzle classes
 * Displays an instance of PuzPane containing SamplePuzzle on a JFrame.
 * @author Jonathan Murphy, Salim Jday,
 * @version 1.0
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
