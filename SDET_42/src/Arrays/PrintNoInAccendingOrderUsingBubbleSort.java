package Arrays;

public class PrintNoInAccendingOrderUsingBubbleSort {

	public static void main(String[] args) {
		int[] a= {5,2,1,4};
		for (int i = 0; i < a.length; i++)
			//i=0 0<4 true a[i]=5
			//i=1 1<4 true a[i]=5
			//i=2 2<4 true a[i]=5
			//i=3 3<4 true a[i]=5
			//i=4 4<4 false terminate
		{
			for (int j = i+1; j < a.length; j++)
				//j=0+1=1  1<4 true
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			//System.out.println(a[i]);
		}
		//OR we have to print using for loop
		for (int k = 0; k < a.length; k++)
		{
			System.out.println(a[k]);
		}
	}

}
