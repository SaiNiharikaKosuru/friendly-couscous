package QB;

class MyClass1
{
 private int area(int side)
 {
  return(side * side);
 }
 public static void main(String args[ ])
 {
  MyClass1 MC = new MyClass1( );
  int area = MC.area(50);
  System.out.println(area);
 }
}

