package biinterfaces;

import java.util.ArrayList;

public class SteamMaxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(12);
		ar.add(25);
		ar.add(45);
		Integer x=ar.stream().min((a,b)->a<b?-1:1).get();
		System.out.println("Minimum is:"+x);
		
		

	}

}
