package pattern;

public class Pattern {

	public static void main(String[] args) {
		
//		* 
//		* * 
//		* * * 
//		* * * * 
//		* * * * * 
		
		int n=5;
		for (int i = 1; i <=n; i++)//--->row
		{
		for (int j = 1; j <=i; j++) //--->column
		{
			System.out.print("* ");
		}	
		System.out.println();
		}

	}

}
