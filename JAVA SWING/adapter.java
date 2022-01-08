import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class adapter extends JFrame{
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    adapter(){
        l1 = new JLabel("num 1");
        l2 = new JLabel("num 2");
        l3 = new JLabel("press any key");
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t3.addKeyListener(new keychecker());
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        setSize(600,400);
        setLayout(new GridLayout(5,2));
        setVisible(true);
    }



    class keychecker extends KeyAdapter{
        public void keyPressed(KeyEvent e){
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            int sum = num1 + num2;
            t3.setText(String.valueOf(sum));
            
        }

    }

    public static void main(String[] args) {
        new adapter();
    }
    


}