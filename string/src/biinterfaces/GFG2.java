package biinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class GFG2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream stream=IntStream.of(3,7,9,12,14);
		boolean answer1=stream.noneMatch(num->num%5==0);
		
		List<Integer> list=Arrays.asList(3,9,16,12,21);
		boolean answer2=list.stream().allMatch(n->n%3==0);
		
		System.out.println(answer1);
		System.out.println(answer2);

	}

}
