package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Sample2 {
 public static void main(String[] args) throws ClassNotFoundException, SQLException {
	 Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","root");
		Statement s=c.createStatement();
		//s.execute("create database product");
		//System.out.println("database created");
//		s.execute("create table products(id int primary key,name varchar(40),price Bigint)");
//		System.out.println("table created");
		
		Scanner sc=new Scanner(System.in);
//		
//		//insert
		PreparedStatement p1=c.prepareStatement("insert into products values(?,?,?)");
		System.out.println("Enter id");
		int id1=sc.nextInt();
		p1.setInt(1, id1);
		
		System.out.println("Enter Name");
		String name1=sc.next();
		p1.setString(2, name1);
		
		System.out.println("Enter price");
		double price=sc.nextDouble();
		p1.setDouble(3, price);
		
		p1.execute();
		System.out.println("Values inserted");
		
		//update
//		PreparedStatement p2=c.prepareStatement("update products set name=? where id=?");
//		System.out.println("Enter name to update");
//		String name2=sc.next();
//		p2.setString(1, name2);
//		
//		System.out.println("Enter id");
//		int id2=sc.nextInt();
//		p2.setInt(2, id2);
//		p2.executeUpdate();
//		System.out.println("Values updated");
		
		//fetch
//		PreparedStatement p3=c.prepareStatement("select * from products where id=?");
//		System.out.println("Enter id");
//		int id3=sc.nextInt();
//		p3.setInt(1,id3);
//		ResultSet r=p3.executeQuery();
//		r.next();
//		System.out.println(r.getInt(1)+ " "+r.getString(2)+" "+r.getDouble(3));
		
		//delete
//		PreparedStatement p4=c.prepareStatement("select * from products where id=?");
//		System.out.println("Enter id");
//		int id3=sc.nextInt();
//		p4.setInt(1,id3);
//		p4.execute();
//		System.out.println("Values deleted");
//		
 }
}