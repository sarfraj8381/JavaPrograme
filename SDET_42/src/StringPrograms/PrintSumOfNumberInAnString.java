package StringPrograms;

public class PrintSumOfNumberInAnString {

	public static void main(String[] args) {
		String s="v2b1d3";//6
		int csum = 0;
		int nsum = 0;
		
		for(int i = 0; i<s.length(); i++) 
		{
		if(s.charAt(i)>='0'&&s.charAt(i)<= '9') {
			
			int n = s.charAt(i)-48; //convert char to int
			csum = csum * 10 + n;
			}else {
				nsum = nsum + csum;
				csum = 0;
			}
		}
		nsum = nsum + csum;
		System.out.println(nsum);


	}

}
