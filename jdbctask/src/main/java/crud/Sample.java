package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Sample {
public static void main(String args[]) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
//	Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
//	Statement s = c.createStatement();
//	s.execute("create database Jspiders");
//	System.out.println("Database created");
//	
	Connection c1 =DriverManager.getConnection("jdbc:mysql://localhost:3306/Jspiders", "root", "root");
	Statement s1 = c1.createStatement();
//	s1.execute("create table trainers(id int primary key, name varchar(40), ph_no long)");
//	System.out.println("Table created");
//	
	
	
	Scanner sc = new Scanner(System.in);
	//	//dynamic input
	PreparedStatement p1 = c1.prepareStatement("Insert into trainers values(?,?,?)");
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

	
	
	//update
	
//	PreparedStatement p2 = c.prepareStatement("update trainers set name=? where id=?");
//	System.out.println("Enter name to update");
//	String name2 = sc.next();
//	p2.setString(1, name2);
//	
//	//in output name should be new and id should be old
//	
//	System.out.println("Enter id");
//	int id2 = sc.nextInt();
//	p2.setInt(2, id2);
//	
//	p2.execute();
//	System.out.println("Values update");	
	
	
	
	
	//fetch
//	PreparedStatement p3 = c.prepareStatement("select * from trainers where id=?");
//	System.out.println("Enter id");
//	int id3 = sc.nextInt();
//	p3.setInt(1, id3);
//	ResultSet r= p3.executeQuery();
//	r.next();
//	System.out.println(r.getInt(1)+" " + r.getString(2)+" "+r.getLong(3));
	
	
	
	
	//Delete
//	PreparedStatement p4 = c.prepareStatement("delete from trainers where id =?");
//	System.out.println("Enter id");
//	int id4 = sc.nextInt();
//	p4.setInt(1, id4);
//	
//	p4.execute();
//	System.out.println("Values deleted");
}
}