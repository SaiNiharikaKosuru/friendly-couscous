package biinterfaces;
import java.util.*;
import java.util.stream.Stream;

public class GFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list= Arrays.asList(13,5,7,9,11);
		Stream s=Stream.of(13,5,7,9,11);
		
		Optional<Integer> answer=list.stream().findAny();
		
		if(answer.isPresent()) {
			System.out.println(answer.get());
		}
		else {
			System.out.println("No value");
		}

	}

}
