package Arrays;

public class Print1stAnd2ndMaximumNoInAnArrayWithoutBubbleSort {

	public static void main(String[] args) {
		int[] a= {5,2,1,4,};
		int fmax=0;
		int smax=0;
		for (int i = 0; i < a.length; i++) 
			
		{
			if(a[i]>fmax)
			{
				smax=fmax;
				fmax=a[i];
			}
			else if(a[i]>smax)
			{
				smax=a[i];
			}
		}
		System.out.println("first max is " + fmax + "  "+"and second max is "+smax);
	}

}
