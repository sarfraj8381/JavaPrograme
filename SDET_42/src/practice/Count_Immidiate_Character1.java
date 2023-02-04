package practice;

public class Count_Immidiate_Character1 {

	public static void main(String[] args) {
		String s="AABBBACCBDDED";
		//AA2, BBB3, A1, CC2, B1, DD2, E1, D1
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
					System.out.print(s.charAt(i)+""+count);
				}

	}

}
