package examplespractise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class UserMain{
public static int getAvgOdd(HashMap<Integer,Integer>hm) {
int sum=0,c=0;
Set s=hm.entrySet();
Iterator it=s.iterator();
while(it.hasNext()) {
Map.Entry m=(Map.Entry)it.next();
int key=(int) m.getKey();
if(key%2!=0) {
int val=(int)m.getValue();
sum=sum+val;
c++;
}
}

return  sum/c;

}
}
public class GetAverageOfOdd{

public static void main(String[] args) {
HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
Scanner sc=new Scanner(System.in);
System.out.println("enter no.of entries u want:");
int n=sc.nextInt();
for(int i=0;i<n;i++) {
hm.put(sc.nextInt(), sc.nextInt());

}
System.out.println(UserMain.getAvgOdd(hm));

}

}


	
	

