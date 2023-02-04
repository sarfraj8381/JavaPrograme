package StringPrograms;

public class ReverseStringEx1 {

	public static void main(String[] args) {

		String str="software";
		char[] s=str.toCharArray();
		for (int i =s.length-1; i>=0 ; i--)
		{
			System.out.print(s[i]);
		}

	}

}
