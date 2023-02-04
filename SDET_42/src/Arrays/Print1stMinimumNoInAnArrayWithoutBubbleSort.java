package Arrays;

public class Print1stMinimumNoInAnArrayWithoutBubbleSort {

	public static void main(String[] args) {

		int[] a= {5,2,1,4,3};
		int min=a[0];//5  2  1
		for (int i = 1; i < a.length; i++) 
			// i=1  1<5 true          a[i]=2
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("the 1st min number is = "+min);
	}

}
