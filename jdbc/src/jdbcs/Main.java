/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbcs;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author kpidi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String url = "jdbc:mysql://localhost:3306/skull";
        String name="root";
        String password="";
        String query = "select * from exams";
        try {
            //  Api to perform Operation With database
            //class.forName() is a method in Java that returns the class object associated
            //with the class or interface passed as the first parameter
            //Use the Class. forName() method to load the driver. The forName() method dynamically 
            //loads a Java class at runtime.
            Class.forName("com.mysql.cj.jdbc.Driver");
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        try {
            Connection conn =  DriverManager.getConnection(url,name,password);
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(query);
            while(result.next()){
                String data ="";
                //get column of table 1 for first column ,...
                data = result.getString(2);
                System.out.println("data: "+data);
            }
                
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
}
