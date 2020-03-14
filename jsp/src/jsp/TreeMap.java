package jsp;
import java.util.*;

public class TreeMap {

public static void main(String[] args) {
HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
ArrayList<Integer> a=new ArrayList<Integer>();
Scanner c = new Scanner(System.in);
System.out.println("ENTER THE COUNT OF ENTERIES");
int n=c.nextInt();
for(int i=0;i<n;i++) {
System.out.println("ENTER SUBJECT ID :");
int id=c.nextInt();
System.out.println("ENTER MARKS FOR " + id);
int marks=c.nextInt();
hm.put(id, marks);
}


Set entries=hm.entrySet();
Iterator itr=entries.iterator();
while(itr.hasNext()) {
Map.Entry me=(Map.Entry)itr.next();

a.add((Integer) me.getValue());


}
Collections.sort(a);
int d=a.get(0)+a.get(1)+a.get(2);
System.out.println("THE SUM OF 3 LEAST SUBJECT MARKS IS:\n" +d);


/*Map<Integer,Integer> ma= new TreeMap<Integer,Integer>();
Set entry2=ma.entrySet();
Iterator itr2=entry2.iterator();
while(itr2.hasNext()) {
Map.Entry me2=(Map.Entry)itr2.next();

System.out.println(me2.getValue());
}



}*/

}
}

