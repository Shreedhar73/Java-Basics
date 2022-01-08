
import javax.swing.*;
public class JavaSwing {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JPanel p = new JPanel();
        JButton b = new JButton("clickme");
        b.setBounds(130,100,150,150);
        p.add(b);
        f.add(p);
        p.setSize(800,400);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);

    }

}
