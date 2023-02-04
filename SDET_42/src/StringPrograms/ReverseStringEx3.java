package StringPrograms;

public class ReverseStringEx3 {

	public static void main(String[] args) {
		String s="software";
		char[] str=s.toCharArray();
		int count=0;
		for (char c : str)
		{
			count++;
		}
		for (int i= count-1; i>=0; i--)
		{
			System.out.print(str[i]);
		}
		
	}

}
