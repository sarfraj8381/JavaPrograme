package Arrays;
public class AdditionOf2Arrays {

	public static void main(String[] args) {
		int[] a= {2,1,5,4,3};
		int[] b= {3,4,1,4};
				//5 5 6 8 3
		int length=a.length;
		if(a.length<b.length)
		{
			length=b.length;
		}
		for (int i = 0; i < length; i++)
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
