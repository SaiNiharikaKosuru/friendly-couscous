package overriding;

abstract class Base {
	   abstract public void myfunc();
       public void another(){
       System.out.println("Another method");
       }
}

public class Abs extends Base{
       public static void main(String argv[]){
       Abs a = new Abs();
       a.amethod();
       }
       public void myfunc(){
               System.out.println("My Func");
               } 
       public void amethod(){
       myfunc();      
       }
}


