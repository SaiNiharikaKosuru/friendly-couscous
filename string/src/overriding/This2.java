package overriding;

class Sample
{int a,b;
Sample()
{ a=1; b=2;
System.out.println(a+"\t"+b);
}
Sample(int x)
{ this(10,20);
a=b=x;
System.out.println(a+"\t"+b);
}
Sample(int a,int b)
{ this();
this.a=a;
this.b=b;
System.out.println(a+"\t"+b);
}
}
class This2
{ public static void main(String args[])
{
Sample s1=new Sample (100);
}
}
