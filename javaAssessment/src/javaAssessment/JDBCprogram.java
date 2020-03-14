package javaAssessment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
			
			String query="insert into employee values(?,?,?,?,?,?)";
			PreparedStatement pst=connection.prepareStatement(query);
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Employee name:");
			String name=sc.next();
			System.out.println("Enter Employee ID:");
			String id=sc.next();
			System.out.println("Enter Employee department:");
			String dept=sc.next();
			System.out.println("Enter Employee designation:");
			String desg=sc.next();
			System.out.println("Enter Employee company:");
			String company=sc.next();
			System.out.println("Enter Employee Email-id:");
			String emailid=sc.next();
			
			pst.setString(1, name);
			pst.setString(2,id);
			pst.setString(3, dept);
			pst.setString(4, desg);
			pst.setString(5, company);
			pst.setString(6, emailid);
			
			int x=pst.executeUpdate();
			System.out.println(x+"Record inserted...");
			
			
			
		}
		catch(Exception e) {

	}



	}

}
