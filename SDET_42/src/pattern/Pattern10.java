package pattern;

public class Pattern10 {

	public static void main(String[] args) {
		
//		1 
//		1 2 
//		1 2 3 
//		1 2 3 4 
//		1 2 3 4 5 
		
		int n=5;
		for (int i = 1; i <=n; i++)//--->row
		{
		for (int j = 1; j <=i; j++) //--->column
		{
			System.out.print(j+" ");
		}	
		System.out.println();

	}

	}

}
