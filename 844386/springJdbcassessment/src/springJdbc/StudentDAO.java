package springJdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class StudentDAO implements IDAO{
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		String sql="select * from student";
		return jdbcTemplate.query("select * from student", new ResultSetExtractor<List<Student>>() {
			public List<Student> extractData(ResultSet rs) throws SQLException,DataAccessException{
				List<Student>  list=new ArrayList<Student>();
				while(rs.next()) {
					Student e=new Student();
					e.setId(rs.getInt(1));
					e.setName(rs.getString(2));
					e.setAge(rs.getInt(3));
					list.add(e);
				}
				return list;
			}
			});
		
	
}

	public boolean searchStudent(int id) {
		String sql="select * from student where id="+id;
		return jdbcTemplate.query(sql, new ResultSetExtractor<Boolean>() {

		@Override
		public Boolean extractData(ResultSet rs) throws SQLException, DataAccessException {
		if(rs.next()) {
		return true;
		}
		else {
		return false;
		}

		}

		});
		}

		public int addRecord(Student st) {
		boolean search_res=searchStudent(st.getId());
		if(search_res)
		{
		return 0;
		}
		else
		{
		String sql="insert into student values (?,?,?)";
		return jdbcTemplate.update(sql,st.getId(),st.getName(),st.getAge());
		}
		}
}


	
	
	

	
