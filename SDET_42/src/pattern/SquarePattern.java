package pattern;

public class SquarePattern {

	public static void main(String[] args) {
//		* * * * *
//		* * * * *
//		* * * * *
//		* * * * *
//		* * * * *
		int n=5;
		for (int i = 0; i <=n; i++)//---->row 
		{
			for (int j = 0; j <=n; j++)//---->column
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
