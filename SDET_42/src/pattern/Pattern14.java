package pattern;

public class Pattern14 {

	public static void main(String[] args) {
		
//		0 
//		2 2 
//		4 4 4 
//		6 6 6 6 
//		8 8 8 8 8 

		
		int n=5;
		int k=0;
		for (int i = 1; i <=n; i++)
		{
			for (int j = 1; j <=i; j++)
			{
			System.out.print(k+" ");	
			}
			System.out.println();
			k=k+2;
		}
	}

}
