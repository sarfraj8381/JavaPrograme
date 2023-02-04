package my_programs;

public class Febonacchi {

	public static void main(String[] args) {
		int feb1=0;
		int feb2=1;
		int feb3;
		for(int i=1; i<=10; i++)
		{
			feb3=feb1+feb2;
			feb1=feb2;
			feb2=feb3;
			System.out.println(feb3);
		}

	}

}
