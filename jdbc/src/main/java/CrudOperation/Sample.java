package CrudOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Sample {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	//Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
	//Statement s = c.createStatement();
	//s.execute("create database employee");
	//System.out.println("Database created");
	Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root", "root");
	Statement s = c.createStatement();
	s.execute("create table emp_det(name varchar(40), id int primary key, ph_no long)");
	System.out.println("Table created");
	
	//s.execute(null)
}
}