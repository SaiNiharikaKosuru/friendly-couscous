package biinterfaces;
import java.util.*;
import java.util.function.BiConsumer;
class Employee{
	String name;
	double salary;
	public Employee(String name,double salary) {
		this.name=name;
		this.salary=salary;
	}
}
public class BiConsumerExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> e=new ArrayList<Employee>();
		
		e.add(new Employee("Niha",40000));
		e.add(new Employee("Bana",30000));
		e.add(new Employee("Sunny",25000));
		e.add(new Employee("Sowji",35000));

		BiConsumer<Employee,Double> c=(a,b)->a.salary=a.salary+b;
		
		for(Employee a:e) {
			c.accept(a, 500.0);
		}
		
		for(Employee a:e) {
			System.out.println("Employee name:"+a.name);
			System.out.println("Employee salary:"+a.salary);
			System.out.println();
		}



	}

}
