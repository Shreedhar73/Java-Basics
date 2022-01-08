import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class Multiply extends JFrame implements ActionListener{
     JLabel l1,l2;
     JTextField t1,t2,t3;
     JButton b1;

     public Multiply(){

        //UI
         l1 = new JLabel("First Number");
         
        //  l1.setBounds(0,0,0,0);
        
        t1 = new JTextField();
        // t1.setBounds(90,280,100,20);

        l2 = new JLabel("Second Number:");
        // l2.setBounds(0,350,120,30);

        t2 = new JTextField();
        // t2.setBounds(150, 350,150,30);

        t3 = new JTextField();
        // t3.setBounds(0,400,150,30);

        b1 = new JButton("Result");
        // b1.setBounds(10,450,150,40);
        
       
        
        
        
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(t3);
        

        b1.addActionListener(this);

        
         
         setSize(800,600);
         setLayout(new GridLayout(5,2));
         setVisible(true);

     }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == b1){
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            int product = num1 * num2;
            t3.setText(String.valueOf(product));
        }
        
    }
    public static void main(String[] args) {
        new Multiply();
    }

    
}
