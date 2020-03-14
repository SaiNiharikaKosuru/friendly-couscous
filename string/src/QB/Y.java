package QB;

class X { int x; X(int x){x=2;}}
class Y extends X{ Y(){} void displayX(){
System.out.print(x);}
public static void main(String args[]){
 new Y().displayX();}}