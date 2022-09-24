package myjdbc;

import java.sql.*;

public class InserJDBC {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //creating a connection
            String url = "jdbc:mysql://localhost:3306/student";
            String username = "root";
            String password = "Toufiqul#@1";
            Connection con = DriverManager.getConnection(url, username, password);

            //create a query
            String q = "create table table1(ID int(20)primary key auto_increment,Name varchar(200) not null,City varchar(400))";

            //creae a statement:
            Statement stmt = con.createStatement();
            stmt.executeUpdate(q);
            System.out.println("table create in database.......");

        } catch (Exception e) {
        }

    }
}
