package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Sample {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/emlpoyee1","root","root");
	Statement s = c.createStatement();
//	s.execute("create database emlpoyee1");
//	System.out.println("Database created");
	s.execute("create table employee1( id int primary key,name varchar(40), ph_no long)");
	System.out.println("Table created");
			
	
}
}
