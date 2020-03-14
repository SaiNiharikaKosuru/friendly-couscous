package jdbc;
import java.sql.*;

public class DataDisplay {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		//Class.forName("com.mysql.cj.jdbc.Driver");
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
		Statement statement=connection.createStatement();
		String query="select * from emp";
		ResultSet rs=statement.executeQuery(query);
		while(rs.next())
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
		rs.close();
		statement.close();
		connection.close();
		
		

	}

}
