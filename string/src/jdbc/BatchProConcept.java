package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class BatchProConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		System.out.println("DRIVERS LOADED");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");

	}
		catch(Exception e) {
	}

}
}
