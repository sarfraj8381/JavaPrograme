package intigers;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {

//			Scanner sc=new Scanner(System.in);
//			String s=sc.next();
			String s="mom";
			String rev="";
			for (int i= s.length()-1;i>=0; i--)
			{
				rev=rev+s.charAt(i);
			}
			if(rev.equals(s))
			{
				System.out.println("it is Palindrome");
			}
			else
			{
				System.out.println("it is not Palindrome");
			}
		}

	}


