package pattern;

public class Pattern4 {

	public static void main(String[] args) {
//			*
//		   * *
//		  * * *
//		 * * * * 
//		* * * * * 
		int n=5;
		for (int i = n; i>0; i--) 
		{
				for (int j = 1; j<=n; j++) 
			    {
					if(i<=j)	
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print(" ");
					}
			    }
			System.out.println();
		}
	}
}
//int n=5;
//for (int i = 1; i <=n; i++) 
//{
//	for (int j = i; j<=n; j++) 
//    {
//		System.out.print(" ");	
//    }
//for (int j = 1; j<=i; j++)
//{
//System.out.print("* ");	
//}
//System.out.println();
//}
	//OR
			

	


