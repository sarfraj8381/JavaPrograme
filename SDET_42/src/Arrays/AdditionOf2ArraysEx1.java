package Arrays;

public class AdditionOf2ArraysEx1 {

	public static void main(String[] args) {
		int[] a= {2,1,5,4};
		int[] b= {3,4,1,4,3};
				
		int length=a.length;
		if(a.length<b.length)
		{
			length=b.length;
		}
		for (int i = 0; i <length; i++)
		{
			try {
				System.out.print(a[i]+b[i]+" ");
			} 
			catch (Exception e) 
			{
				if(a.length<b.length)
				{
					System.out.print(b[i]+" ");
				}
				else {
					System.out.print(a[i]+" ");
				}
		}
	}

}
}