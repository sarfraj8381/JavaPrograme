package Arrays;

public class Print1stAnd2ndMinimumNoInAnArrayWithoutBubbleSort {

	public static void main(String[] args) {
		int[] a= {5,2,1,4,3};
		int fmin=a[0];
		int smin=a[0];
		for (int i = 0; i < a.length; i++) 
			// i=1  1<5 true          a[i]=2
		{
			if(fmin>a[i])
			{
				smin=fmin;
				fmin=a[i];
			}
			else if(a[i]<smin)
			{
				smin=a[i];
			}
		}
		System.out.println(fmin+"       "+smin);
	}

}
