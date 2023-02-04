package my_programs;

public class Upper_And_Lower_count {

	public static void main(String[] args) {
		String s="Hello Im SarFraJ";
		int lower = 0;
		int upper = 0;
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(ch>='A' &&ch<='Z')
			{
				upper++;
			}
			else
			{
				lower++;
			}
		}
		System.out.println("lower "+lower);
		System.out.println("upper "+upper);
	}

}
