package jdbc;

import java.sql.*;
import java.util.Scanner;

public class PreparedStatementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
			String query="insert into jdbc values(?,?)";
			PreparedStatement pst=connection.prepareStatement(query);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter customer name:");
			String name=sc.next();
			System.out.println("Enter customer ID:");
			int id=sc.nextInt();
			pst.setString(1, name);
			pst.setInt(2,id);
			int x=pst.executeUpdate();
			System.out.println(x+"Record inserted...");
			
			
			
		}
		catch(Exception e) {

	}

}
}