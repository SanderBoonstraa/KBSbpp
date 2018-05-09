import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;

public class AbstractScreen extends JFrame implements ActionListener {
    private JButton jbStart;
    private JButton jbSelecteerOrder;
    private JPanel boxContent;

    public AbstractScreen() {
        setTitle("Title");
        setSize(2000, 1000);
        setMinimumSize(new Dimension(1500, 500));
        setLayout(new FlowLayout());

        jbSelecteerOrder = new JButton("Selecteer Order");
        add(jbSelecteerOrder);
        jbSelecteerOrder.addActionListener(this);

        AlgorithmSelector AS = new AlgorithmSelector();
        add(AS.getCb());
        AS.setVisible(true);

        jbStart = new JButton("Start");
        add(jbStart);
        jbStart.addActionListener(this);

        DrawPanel k = new DrawPanel();

    }


    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==jbSelecteerOrder){
            FileDialog dialog = new FileDialog((Frame)null, "Select File to Open");
            dialog.setMode(FileDialog.LOAD);
            dialog.setVisible(true);
            String file = dialog.getFile();
            System.out.println(file + " chosen.");
        }
    }
}
