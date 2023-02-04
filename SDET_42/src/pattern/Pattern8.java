package pattern;

public class Pattern8 {

	public static void main(String[] args) {
//		
//		1 
//		1 1 
//		1 1 1 
//		1 1 1 1 
//		1 1 1 1 1 

		int n=5;
		for (int i = 1; i <=n; i++)//--->row
		{
		for (int j = 1; j <=i; j++) //--->column
		{
			System.out.print("1 ");
		}	
		System.out.println();
		}

	}

}
