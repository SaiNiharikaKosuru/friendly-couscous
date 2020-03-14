package string;

public class UseMainCode {
	public static int findElement(int[] array,int element) {
		boolean found=false;
		for(int x=0;x<=array.length;x++) {
			if(array[x]==element) {
				found=true;
				break;
			}
		}
		if(found)
			return 1;
		else
			return 0;
	

	}

}
