package practice;

import java.util.Scanner;

public class Count_least {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter character ");
		String s = sc.next();
		System.out.println(s);
		for(int i=0;  i<s.length(); i++)
		{
			int count=1;
			for(int j=i+1; j<s.length(); j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{ 
					i++;
					count++;
				}
				else
				{
					break;
				}
			}
			System.out.println(s.charAt(i)+"  "+ count);
		}

	}

}
