package my_programs;

public class Swape_Two_Number_Without_Using_3rd_Variable {

	public static void main(String[] args) {
		int a=5;
		int b=6;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

}
