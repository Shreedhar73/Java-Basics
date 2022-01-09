// Write a java program to create login form with user id, password, ok button, and cancel 
// button. Handle key events such that pressing ‘l’ performs login and pressing ‘c’ clears 
// text boxes and puts focus on user id text box. Assume user table having fields Uid and 
// Password in the database named account. 
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class modelQuestion2 extends JFrame{
    
    JLabel ul,pl;
    JTextField uT,pT;
    JButton b1,b2;

    public modelQuestion2(){
        ul = new JLabel("Enter User ID: ");
        
        uT = new JTextField();
        pl = new JLabel("Enter Password: ");
        pT = new JTextField();
        b1 = new JButton("Login");
        b2 = new JButton("Cancel");

        add(ul);
        add(uT);
        add(pl);
        add(pT);
        add(b1);
        add(b2);

        b1.addKeyListener(new LoginAdapter());

        setSize(600,400);
        setLayout(new GridLayout(5,2));
        setVisible(true);

        
    }

    class LoginAdapter extends KeyAdapter{
        public void keyPressed(KeyEvent e){


            //
            if(e.getKeyChar() == "l"){ 

            try {
                String driver = "com.mysql.cj.jdbc.Driver";
                String url = "jdbc:mysql://localhost:3306/db1";
                String user_name = "root";
                String password = "1234567";
                
                //connection
                Connection conn = DriverManager.getConnection(url,user_name,password);
                System.out.println("connected");

                //fetching password and UID
                String query = "Select * from Person";
                Statement stm = conn.createStatement(query);
                ResultSet rs = stm.executeQuery(query);
                while(rs.next()){
                    String uid = rs.getString(1);
                    String pwd = rs.getString(2);
                }
                if((String.valueOf(uT) == uid)&&String.valueOf(pT) == pwd){
                    System.out.println("Login Successful");

                }else{
                    System.out.println("Login Failed");
                }

                
            }catch (Exception x){
                System.out.println(x);


            }
        
        }
            
            if(e.getKeyChar() == "c"){
                
              ut.setText("");
              pt.setText("");
              ut.setFocus();
                
                }
                
            }
        }

    public static void main(String[] args) {
        new modelQuestion2();
    }
 
}
