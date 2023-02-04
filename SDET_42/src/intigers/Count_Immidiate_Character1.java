package intigers;

public class Count_Immidiate_Character1 {

	public static void main(String[] args) {
		String s="AABBBACCBDDED";      //Output:- AA2BBB3A1CC2B1DD2E1D1

		for (int i = 0; i < s.length(); i++) 
		{
			int count=1;
			for(int j=i+1; j<s.length(); j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
					i++;
					System.out.print(s.charAt(i));
				}
				else 
				{
					break;
				}
			}
		}
	}
}
