package springJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jdbcxml.xml");
		
		EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");
		Employee emp=new Employee();
		emp.setEmpid("9892");
		emp.setEname("Kriansh");
		emp.setDept("Developing");
		emp.setDesg("Developer");
		emp.setEmailid("kriansh.k123@gmail.com");
		
		int status=dao.saveEmployee(emp);
		System.out.println(status);
		System.out.println("Record inserted...!");
		
		/*delete
		 int res1=dao.deleteEmployee("2345");
		 if(res1==1)
		 {
			 System.out.println("deleted");
		 }
		 else {
			 System.out.println("not deleted");
		 }*/
		
		
		
		/*update
		int u=dao.updateEmployee("4576");
		if(u==1)
		System.out.println(u + "RECORD UPDATED");
		else
			System.out.println("RECORD NOT UPDATED");
			*/

	}

}
