package StringPrograms;

public class SumOf2DigitsInString {

	public static void main(String[] args) {
		String s="12ab10c3";//25
		
		int sum = 0;
		int tsum=0;
		for(int i = 0; i<s.length(); i++) 
		{
		if(s.charAt(i)>='0'&&s.charAt(i)<= '9')
		{
			int n=s.charAt(i)-48;
			tsum=tsum*10+n;
		}
		else
		{
			sum=sum+tsum;
			tsum=0;
		}
		
	}
		sum=sum+tsum;
		System.out.println(sum);
	}

}
