package Arrays;

public class AdditionOf2Array {

	public static void main(String[] args) {
		int[] a= {2,1,5,4,3};
		int[] b= {3,4,1,4,5};
		        //5 5 6 8 8
		if(a.length==b.length)
		{
			for (int i = 0; i < a.length; i++)
			{
				System.out.print(a[i]+b[i]+" ");	
			}
			
		}
	}

}
