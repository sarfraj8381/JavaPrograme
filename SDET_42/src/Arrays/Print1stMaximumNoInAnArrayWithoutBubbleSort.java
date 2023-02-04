package Arrays;

public class Print1stMaximumNoInAnArrayWithoutBubbleSort {

	public static void main(String[] args) {
		int[] a= {5,2,1,7,4,3,5};
		int max=a[0];//5  2  1
		for (int i = 1; i < a.length; i++) 
			
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("the 1st maximum number is = "+max);

	}

}
