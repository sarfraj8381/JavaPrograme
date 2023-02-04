package Arrays;

public class Print2NdMaximumNoInAnArray {

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
		//a[0]=5   a[1]=4   a[2]=2   a[3]=1
		
			System.out.println(a[1]);
			//for last maximum number in an array
//			System.out.println(a[a.length-1]);
			
	}

}
