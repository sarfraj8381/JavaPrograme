package StringPrograms;

public class PalindromeString {

	public static void main(String[] args) {
//		String s ="kanada";
		String s="mom";
//		String s="malayalam";
		String rev="";
		for (int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		if(rev.equals(s))
		{
			System.out.println("it is palindrome");
		}
		else {
			System.out.println("it is not palindrome");
		}
	}

}
