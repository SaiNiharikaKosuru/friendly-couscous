package predicate;
import java.util.function.Function;

class Student{
	String name;
	int marks;
	public Student(String n,int m) {
		super();
		this.name=n;
		this.marks=m;
	}
}
public class functionExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("Niha",90);
		Function<Student,String> mos=m->{
			
			if(m.marks>80) {
				return "A+(DISTINCTION)";
			}
			else if(m.marks<60) {
				return "A";
			}
			else {
				return "fail";
			}
			
		};
		System.out.println("The grade of student is:"+(mos.apply(s1)));
		

	}

}
