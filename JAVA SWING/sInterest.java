import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 class sInterest extends JFrame implements ActionListener{
    JLabel p,t,r,i;
    JTextField pT,tT,rT,iT;
    JButton c;

    sInterest(){
        p = new JLabel("Principle");
        // p.setBounds(20,0,100,20);
        pT = new JTextField();
        // pT.setBounds(120,130,100,20);

        t = new JLabel("time");
        // t.setBounds(0, 155, 100, 20);

        tT = new JTextField();
        // tT.setBounds(110,155,100,20);

        r = new JLabel("rate");
        // r.setBounds(0,180,100,20);

        rT = new JTextField();
        // rT.setBounds(110,180,100,20);

        i = new JLabel("Interest");
        // i.setBounds(0,205,100,20);

        iT = new JTextField();
        // iT.setBounds(110,205,100,20);

        c = new JButton("Calculate");
        // c.setBounds(50,230,100,20);
        


       
        
        
        
        
        
        
        add(p); 
        add(pT);
        add(t);
        add(tT);
        add(r);
        add(rT);
        add(i);
        add(iT);
        add(c);
        c.addActionListener(this);
        setLayout(new GridLayout(5,2));

        setSize(400,300);
        
        setVisible(true);
    }


    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == c){
            int pri = Integer.parseInt(pT.getText());
            int rate = Integer.parseInt(rT.getText());
            int time = Integer.parseInt(rT.getText());

            int interest = (pri*rate*time)/100;
            iT.setText(String.valueOf(interest));

        }
        

    }

    public static void main(String[] args) {
        new sInterest();
    }

    
}
