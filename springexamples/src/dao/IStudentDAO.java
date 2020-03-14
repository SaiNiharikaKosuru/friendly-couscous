package dao;

import java.util.List;

import data.Student;

public interface IStudentDAO {
	/*THis is the method used to create a record in student table*/
	public void create(Student student);
	
	/*THis is the method used to list down a  record from the Student table corresponding to a passed student id*/
	public Student getStudent(Integer id);
	
	
	/*THis is the method used to list down all the  records from the Student table*/
	public List<Student> listStudents();
	
	/*THis is the method used to delete a  record from the Student table corresponding to a passed student id*/
	public void delete(Integer id);
	
	/*THis is the method used to update a record in student table*/
	public void update(Integer id,Integer age);
	
	
	

	
	

}
