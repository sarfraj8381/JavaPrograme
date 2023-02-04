package intigers;

public class Find_sub_String {

	public static void main(String[] args) {
		String s="aabbabc";
		System.out.println(s);
//		char[] s1 = s.toCharArray();
		for(int i=1; i<=s.length(); i++)
		{
			for(int j=0; j<=s.length()-i; j++)
			{
				int h=j+i-1;
				for(int k=i; k<=h; k++)
				{
					System.out.print(s.charAt(k));
				}
				System.out.println();
			}
		}
	}

}
