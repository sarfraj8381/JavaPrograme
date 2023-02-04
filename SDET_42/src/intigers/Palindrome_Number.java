package intigers;

public class Palindrome_Number {

	public static void main(String[] args) {
		int no=303;
		int temp=no;
		int rev = 0;
		while(no>0)
		{
			int digit=no%10;
			rev=(rev*10)+digit;
			no=no/10;
		}
		if(rev==temp)
		{
			System.out.println("it is Palindrome");
		}
		else
		{
			System.out.println("it is not Palindrome");
		}

	}

}
