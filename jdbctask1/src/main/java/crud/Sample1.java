package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Sample1 {
public static void main(String args[]) throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.cj.jdbc.Driver");

//  Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
//  Statement s = c.createStatement();
//  s.execute("create database College");
//  System.out.println("Database created");
//
   Connection c1 =DriverManager.getConnection("jdbc:mysql://localhost:3306/College", "root", "root");
    Statement s1 = c1.createStatement();
//
//  s1.execute("create table college(id int primary key, name varchar(40), ph_no long)");
//  System.out.println("Table created");

    Scanner sc = new Scanner(System.in);

    PreparedStatement p1 = c1.prepareStatement("Insert into college values(?,?,?)");

    System.out.println("Enter id :");
    int id1 = sc.nextInt();
    p1.setInt(1, id1);

    System.out.println("Enter name :");
    String name1 = sc.next();
    p1.setString(2, name1);

    System.out.println("Enter number :");
    long ph1 = sc.nextLong();
    p1.setLong(3, ph1);

    p1.execute();
    System.out.println("Values Inserted");
    
 // UPDATE
    PreparedStatement p2 = c1.prepareStatement("update trainers set name=? where id=?");
    System.out.println("Enter name to update:");
    String name2 = sc.next();
    p2.setString(1, name2);

    System.out.println("Enter id:");
    int id2 = sc.nextInt();
    p2.setInt(2, id2);

    p2.execute();
    System.out.println("Values Updated");

    // FETCH
    PreparedStatement p3 = c1.prepareStatement("select * from trainers where id=?");
    System.out.println("Enter id to fetch:");
    int id3 = sc.nextInt();
    p3.setInt(1, id3);

    ResultSet r = p3.executeQuery();
    if(r.next()) {
        System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getLong(3));
    }

    // DELETE
    PreparedStatement p4 = c1.prepareStatement("delete from trainers where id=?");
    System.out.println("Enter id to delete:");
    int id4 = sc.nextInt();
    p4.setInt(1, id4);

    p4.execute();
    System.out.println("Values Deleted");
}
}
