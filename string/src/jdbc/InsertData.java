package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
		Statement statement=connection.createStatement();
		String query="insert into students values"
				+"('CTSJAVA02','Nikki','IT',234)";
		//String query="update students set branch='IT' where name='nikki'";
		//int count=statement.executeUpdate(query);
		boolean flag=statement.execute(query);
		if(flag)
		   System.out.println("Record inserted");
		else
			System.out.println("not inserted");
		statement.close();
		connection.close();

	}

}
