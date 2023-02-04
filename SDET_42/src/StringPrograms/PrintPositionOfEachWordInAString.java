package StringPrograms;


public class PrintPositionOfEachWordInAString {

	public static void main(String[] args) {
		String str="i am from sdet42 i from batch";
		String[] s = str.split(" ");
		
		for(int i=0;  i<s.length;  i++)
		{
			System.out.println(s[i]+ "   " +i);
		}
	}
}
