package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
		Statement statement=connection.createStatement();
		String query="create table jdbc(name char(15),id int(5))";
		int count=statement.executeUpdate(query);

	
		System.out.println(count+" "+"Table created");
		statement.close();
		connection.close();
				

	}

}
