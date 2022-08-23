package jdbc;

import java.sql.*;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.*;
import jdbc.*;

public class Jdbc {

    public static void main(String[] args) throws SQLException {
        try {
            //load the drive:
            Class.forName("com.mysql.jdbc.Driver");

            //creating a connection
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","Tusher#@1");
            //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Tusher#@1");
            
            if(con.isClosed()){
                System.out.println("connection is closed");
            }else{
                System.out.println("connection created...");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
