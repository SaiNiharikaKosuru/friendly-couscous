package predicate;
import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
	String name;
	float salary;
	String designation;
	String city;
	public Employee(String n,float s,String d,String c) {
		super();
		this.name=n;
		this.salary=s;
		this.designation=d;
		this.city=c;
	}
	@Override
	public String toString() {
		return "Employee [name="+name+",salary="+salary+",designation="+designation+",city="+city+"]";
	}
	
	public boolean equals(Object obj) {
		Employee e=(Employee)obj;
		if(designation.equals(e.designation)&& name.equals(e.name) && salary==(e.salary) && city.equals(e.city)) {
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
}
public class employeeManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee("Niha",32000,"Developer","Hyd");
		Employee emp2=new Employee("Anu",22000,"Manager","Hyd");
		Employee emp3=new Employee("Pranavi",12000,"Tester","Kolkata");
		Employee emp4=new Employee("Alekhya",32000,"Developer","Bangalore");
		Employee emp5=new Employee("Bhavani",26000,"Lead","Hyd");
		Employee emp6=new Employee("Sowjanya",52000,"Manager","Hyd");
		Employee emp7=new Employee("Sadik",62000,"Developer","Bangalore");
		Employee emp8=new Employee("Sandeep",98000,"Developer","Hyd");
		Employee emp9=new Employee("Sunny",62000,"Manager","Kolkata");
		
		Predicate<Employee> p1=emp->emp.designation.equals("Developer");
		
		Predicate<Employee> p2=emp->emp.city.equals("Hyd");
		
		Predicate<Employee> p3=emp->emp.salary>25000;
		
		System.out.println(emp1);
		
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		list.add(emp7);
		list.add(emp8);
		list.add(emp9);
		display(p2,list);
	}
		
		public static void display(Predicate<Employee> p,ArrayList<Employee> list) {
			for(Employee e:list)
			{
				if(p.test(e)) {
					System.out.println(e);
				}
			}
		}
	
		
			
		

	

}
