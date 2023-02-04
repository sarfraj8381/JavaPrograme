package StringPrograms;

public class ReverseASentanceInAGivenString {

	public static void main(String[] args) {
		String str="i am from sdet42 batch";
		String[] s = str.split(" ");
		
		for (int i = 0; i < s.length; i++)
		{
			//System.out.println(s[i]+" ");
			String s1 = s[i];
			for (int j = s1.length()-1; j>=0; j--) 
			{
			System.out.print(s1.charAt(j));	
			}
			System.out.print(" ");
		}
		
		

	}

}
