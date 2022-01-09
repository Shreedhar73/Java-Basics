

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcConn {
	
	public static void main(String[] args) throws Exception{
		
		dbConnection();
		createTable();
		insertData();
        showData();
		deleteData();
	}
	
	//connecting with mysql
	public static Connection dbConnection() throws Exception {
	
		
 		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/db1";
			String user_name = "root";
			String password = "1234567";
			
			//connection
			Connection conn = DriverManager.getConnection(url,user_name,password);
			System.out.println("connected");
			return conn;
		} catch(Exception e) {System.out.println(e);}
		return null;
		}
	
	//creating table
	
	public static void createTable() throws Exception{
		
		try{
			Connection conn1 = dbConnection();
			
			String query = "CREATE TABLE Person(ID int NOT NULL AUTO_INCREMENT, FirstName varchar(50), LastName varchar(50), PRIMARY KEY(ID))";
		PreparedStatement create = conn1.prepareStatement(query);
		create.executeUpdate();
		} 
		catch(Exception e){System.out.println(e);}
		finally {System.out.println("function run");}
		
	}
	
	//inserting data in table
	
	
	public static void insertData() throws Exception{
		
		final String  var1= "";
		final String var2="";
		
		try {
			Connection conn2 = dbConnection();
			String query1 = "insert into person(FirstName, LastName) values('"+var1+"','"+var2+"')";
			PreparedStatement insert = conn2.prepareStatement(query1);
			insert.executeUpdate();
		} 
		catch (Exception e) {System.out.println(e);}
		finally {System.out.println("insert has not complete");}
	}

    //displaying data from table
    public static void showData() throws Exception{
        try{
            Connection conn3 = dbConnection();
            String query = "Select * from Person";
            Statement stm = conn3.createStatement(query);
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                String n = rs.getString(1);
                String m = rs.getString(2);
            }


        }catch(Exception e){

        }finally{
            System.out.println("Displayed");
        }
    }
	
	//delete
	
	public static void deleteData() throws Exception{
		
		try {
			Connection conn3 = dbConnection();
			String query3 ="DELETE FROM person WHERE ID=9";
			PreparedStatement delete = conn3.prepareStatement(query3);
			delete.executeUpdate();
			
		}
		catch (Exception e) {System.out.println(e);}
		finally {System.out.println("delete data");}
	}

}