package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class PreparedStatementSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
			String query=" select * from jdbc where id=?";
			PreparedStatement pst=connection.prepareStatement(query);
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter customer ID:");
			int id=sc.nextInt();
			pst.setInt(1,id);
			
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				System.out.println(rs.getString(1));
			}
			else {
				System.out.println("NOT FOUND");
			}
		
			rs.close();
			pst.close();
			connection.close();
			
			
			
		}
		catch(Exception e) {

	}

	}

}
