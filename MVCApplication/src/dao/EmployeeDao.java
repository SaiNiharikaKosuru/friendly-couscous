package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import mvc.Employee;

public class EmployeeDao {
	public static Connection getConnection() throws SQLException, ClassNotFoundException  {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
		return connection;
		}

	public int insertEmployee(Employee emp) {//inserts into DB
		int result=0;
		try
		{
			Connection con=getConnection();
			String sql="insert into employee values(?,?,?,?,?)";
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1,emp.getEmpid());
			pst.setString(2,emp.getEname());
			pst.setString(3,emp.getDept());
			pst.setString(4,emp.getDesg());
			pst.setString(5,emp.getEmailid());
			result=pst.executeUpdate();
		}	
		catch(Exception e)
		{
			System.out.println(e);
		}
		return result;
	}
	public List<Employee> showEmployees() throws SQLException, ClassNotFoundException {//connect to database and do operations
		
			Connection con=getConnection();
			Statement ps=con.createStatement();
			ResultSet rs=ps.executeQuery("select * from employee");
			ArrayList<Employee> list=new ArrayList<Employee>();
			while(rs.next()) {
				Employee u=new Employee();
				u.setEmpid(rs.getString(1));
				u.setEname(rs.getString(2));
				u.setDept(rs.getString(3));
				u.setDesg(rs.getString(4));
				u.setEmailid(rs.getString(5));
				list.add(u);
				
			}
		
		return list;
	}
	public Employee searchEmployee(String id) {
		Employee emp=new Employee();
		try {
			Connection con=getConnection();
			String sql="select * from employee where empid=?";
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1, id);
			
		}
	}
}

