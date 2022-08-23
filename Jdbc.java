package jdbc;

import java.sql.*;
import jdbc.*;

public class PreparedStatement_insert {

    public static void main(String[] args) {
        try {
            //driver connection
            Class.forName("com.mysql.jdbc.Driver");

            //creating a connection
            String url = "jdbc:mysql://localhost:3306/youtube";
            String username = "root";
            String password = "Tusher#@1";
            Connection con = DriverManager.getConnection(url, username, password);
            //create a query
            String q = "insert into table1(tName,tCity)values(?,?)";
            //get the preparedStatement object
            PreparedStatement pstmt = con.prepareStatement(q);

            //set the values to query
            pstmt.setString(1, "Toufiqul Islam");
            pstmt.setString(2, "Dhaka");

            pstmt.executeUpdate();

            System.out.println("Inserted...");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
