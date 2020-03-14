package string;

public class arrayCommon {
	public static int commonSum(int[] array1,int[] array2) {
		int i,j,sum=0;
		for(i=0;i<n1;i++)
		{
			for(j=0;j<n2;j++)
			{
				if(arr1[i]==arr2[j]) {
					sum+=arr1[i];
					break;
				}
				else
					continue;
				
			}
		}
		
		return sum;
	}

}
