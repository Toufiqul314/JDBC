package jdbc;

import java.sql.*;
import java.io.*;
import java.util.Scanner;

public class user_input {

    public static void main(String[] args) {
        try {
            //driver connection 
            Class.forName("com.mysql.jdbc.Driver");
            //creating a connection
            String url = "jdbc:mysql://localhost:3306/youtube";
            String username = "root";
            String password = "Tusher#@1";
            Connection con = DriverManager.getConnection(url, username, password);
            //creat a query
            String q = "insert into table1(tName,tCity)values(?,?)";
            //get the preparedStatement object
            PreparedStatement pstmt = con.prepareStatement(q);
            //user input
            Scanner br = new Scanner(System.in);
            System.out.println("Enter name :");
            String name = br.nextLine();
            System.out.println("Enter city :");
            String city = br.nextLine();
            //set the values to query
            pstmt.setString(1, name);
            pstmt.setString(2, city);

            pstmt.executeUpdate();
            System.out.println("Insert...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
