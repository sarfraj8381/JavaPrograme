package StringPrograms;

public class ReverseString {

	public static void main(String[] args) {
		String s="software";
		for (int i =s.length()-1; i>=0; i--) 
		{
			char s1 = s.charAt(i);
			System.out.print(s1);
		}

	}

}
