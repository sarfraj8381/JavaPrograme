package practice;

public class Find_Min_Character {

	public static void main(String[] args) {
		String s="md sarfraj ahmad";
		String[] s1 = s.split(" ");
		String min=s1[0];
		
		for(int i=0; i<s1.length; i++)
		{
			if(min.length()>s1[i].length())
			{
				min=s1[i];
			}
		}
		System.out.println("minium character is = "+min);
	}

}
