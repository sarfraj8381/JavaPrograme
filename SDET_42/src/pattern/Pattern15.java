package pattern;

public class Pattern15 {

	public static void main(String[] args) {
		
//		5 
//		5 4 
//		5 4 3 
//		5 4 3 2 
//		5 4 3 2 1 

		int n=5;
		for (int i = 1; i <=n; i++)//--->row
		{
			int k=5;
		for (int j = 1; j <=i; j++) //--->column
		{
			System.out.print(k--+(" "));
		}	
		System.out.println();
		}

	}

}
