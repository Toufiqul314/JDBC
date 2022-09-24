package jdbc3;

import java.sql.*;

public class Jdbc3 {

    public static void main(String[] args) {

        try {
            //load the driver:
            Class.forName("com.mysql.cj.jdbc.Driver");
            //creating a connection
            String url = "dbc:mysql://localhost:3306/student";
            String username = "root";
            String password = "Toufiqul#@1";
            Connection con = DriverManager.getConnection(url, username, password);
            if (con.isClosed()) {
                System.out.println("connection is closed");
            } else {
                System.out.println("connection created...");
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}
