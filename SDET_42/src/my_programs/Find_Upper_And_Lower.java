package my_programs;

public class Find_Upper_And_Lower {

	public static void main(String[] args) {
		String s="Hello Im SarFraj";
		String upper="";
		String lower="";
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(ch>='a'&& ch<='z')
			{
				lower=lower+ch;
			}
			else
			{
				upper=upper+ch;
			}
		}
		System.out.println(upper);
		System.out.println(lower);
	}

}
