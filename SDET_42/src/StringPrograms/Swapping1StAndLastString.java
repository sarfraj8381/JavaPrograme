package StringPrograms;

public class Swapping1StAndLastString {

	public static void main(String[] args) {

		String str="i am from sdet42 batch";
		String[] s=str.split(" ");
		
//		int temp=a;
//		a=b;
//		b=temp;
		
		String temp=s[0];
		s[0]=s[s.length-1];
		s[s.length-1]=temp;
		
		for(int i=0;  i<s.length;  i++)
		{
			System.out.print(s[i]+" ");
		}
	}

}
