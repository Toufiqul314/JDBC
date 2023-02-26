package JDBC;

import java.sql.*;
import java.util.*;

public class NewClass2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("enter your name :");
            String name = input.nextLine();
            System.out.print("Enter your city name :");
            String city = input.nextLine();
            System.out.print("enter your phone number :");
            int phone = input.nextInt();
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/teacher";
            String username = "root";
            String password = "Toufiqul#@1";
            Connection con = DriverManager.getConnection(url, username, password);

            String q = "insert into info(name,city,phone)values(?,?,?)";
            PreparedStatement pstm = con.prepareStatement(q);
            pstm.setString(1, name);
            pstm.setString(2, city);
            pstm.setInt(3, phone);
            pstm.executeLargeUpdate();
            System.out.println("done.....");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error");
        }
    }

}
