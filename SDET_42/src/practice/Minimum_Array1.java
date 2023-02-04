package practice;

public class Minimum_Array1 {

	public static void main(String[] args) {
		int[] s={7,9,2,8,5};
		for(int i=0; i<s.length; i++) 
		{
			for(int j=i+1; j<s.length; j++)
			{
				if(s[i]<s[j])
				{
					int temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		System.out.println(s[s.length-1]);
	}

}
