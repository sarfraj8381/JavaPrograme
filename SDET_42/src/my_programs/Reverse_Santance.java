package my_programs;

public class Reverse_Santance {

	public static void main(String[] args) {
		String str="hello who is there";
	String[] s=str.split(" ");
	for(int i=0; i<s.length; i++)
	{
		String s1=s[i];
		for(int j=s1.length()-1; j>=0; j--)
		{
			System.out.print(s1.charAt(j));
		}
		System.out.print(" ");
	}
	}

}
