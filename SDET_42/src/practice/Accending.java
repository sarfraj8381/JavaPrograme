package practice;

public class Accending {

	public static void main(String[] args) {
		
		String[] s= {"2k","3k","10k","5k"};
		
		for(int i=0; i<s.length-1; i++)
		{
			if(s[i].charAt(0)<s[i+1].charAt(0))
			{
				String ss=s[i];
				s[i]=s[i+1];
				s[i+1]=ss;
			}
			
		}
		for(String ss:s)
			System.out.println(ss);
	}

}
