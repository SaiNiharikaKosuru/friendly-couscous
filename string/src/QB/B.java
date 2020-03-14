package QB;

class A{ int a; A(int a){a=4;}}
class B extends A{ B(){super(3);} void displayA(){
System.out.print(a);}
public static void main(String args[]){
  new B().displayA();}}