package StringPrograms;

public class ReverseStringEx2 {

	public static void main(String[] args) {
		String s="software";
		String rev="";
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.print(rev);
	}

}
