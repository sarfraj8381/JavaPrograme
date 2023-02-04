package StringPrograms;

public class ReverseAGivenSentence {

	public static void main(String[] args) {
		String s="i am from sdet42 batch";
		String[] s1 = s.split(" ");
		for(int i=s1.length-1;i>=0;i--)
		{
			System.out.print(s1[i]+"  ");
		}
	}

}
