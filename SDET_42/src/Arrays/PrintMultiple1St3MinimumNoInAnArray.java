package Arrays;

public class PrintMultiple1St3MinimumNoInAnArray {

	public static void main(String[] args) {
		int[] a= {5,2,1,4,3};
		for (int i = 0; i < a.length; i++)
			
		{
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
			int mul=1;
			for (int i = 0; i <3; i++) 
			{
			mul=mul*a[i];	
			}
			System.out.println("multiple of 1st 3 minimum number is = "+mul);

	}

}
