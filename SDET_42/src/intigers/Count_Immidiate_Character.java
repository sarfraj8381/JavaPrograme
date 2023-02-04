package intigers;

public class Count_Immidiate_Character {
	public static void main(String[] args) {
		String s="AABBBACDDADCAAH";		//Output:-  A2B3A1C1D2A1D1C1A2H1
		
		for (int i = 0; i < s.length(); i++) 
		{
			int count=1;
			for (int j = i+1; j < s.length(); j++)  
			{
				
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
					i++;
				}
				else 
				{
					break;
				}
			}
			System.out.print(s.charAt(i)+""+count+" ");
		}
	}
}
