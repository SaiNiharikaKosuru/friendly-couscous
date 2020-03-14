package overriding;

class One{
int var1;
One (int x){
var1 = x;
}}
class Derived extends One{
int var2;
Derived(){
super(10);
var2=10;
}
void display(){
System.out.println("var1="+var1+" , var2="+var2);
}}
class Main{
public static void main(String[] args){
Derived obj = new Derived();
obj.display();
}}
