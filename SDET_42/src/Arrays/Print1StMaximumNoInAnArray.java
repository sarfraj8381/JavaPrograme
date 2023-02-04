package Arrays;

public class Print1StMaximumNoInAnArray {

	public static void main(String[] args) {

		int[] a= {5,2,1,4};
		for (int i = 0; i < a.length; i++)
			
		{
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
//		a[0]=5   a[1]=4   a[2]=2   a[3]=1
			System.out.println(a[0]);
	}
}
