import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        AlgorithmTester algorithmTester = new AlgorithmTester();
        algorithmTester.startWorstFit();
        algorithmTester.printBoxes();


        JFrame frame = new JFrame("App");
        App app = new App();
        frame.setContentPane(app.mainFrame);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
