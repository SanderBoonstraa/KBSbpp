import javax.swing.*;
import java.awt.*;
import java.awt.Dimension;


public class DrawPanel extends JPanel {
    public DrawPanel() {
        this.setPreferredSize(new Dimension(400, 500));
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
    }
}
