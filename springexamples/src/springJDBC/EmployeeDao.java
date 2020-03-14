package springJDBC;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	
	public int saveEmployee(Employee e) {
		String query="insert into employee(empid,ename,dept)"+"values('"+e.getEmpid()+
				"' , '"+e.getEname()+"' , '"+e.getDesg()+"')";
		return jdbcTemplate.update(query);
	}
	
	public int updateEmployee(String empid) {
		String query="update employee set ename='Nikkish' where empid="+empid;
				
		return jdbcTemplate.update(query);
	}
	public int deleteEmployee(String empid) {
		String query="delete from employee where  empid="+empid;
		return jdbcTemplate.update(query);
		
	}
	

}
