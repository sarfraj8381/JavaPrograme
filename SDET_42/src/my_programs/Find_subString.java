package my_programs;

public class Find_subString {

	public static void main(String[] args)
	{
	String s = "aabbabc";
	int n=s.length();
	for(int i=0; i<n; i++)
	{
	    char[] temp=new char[n-i+1];
		int tempIndex=0;
		for(int j=i; j<n; j++)
		{
			temp[tempIndex++]=s.charAt(j);
			temp[tempIndex]=0;
			System.out.println(temp);
		}
	}
	
  }
}

