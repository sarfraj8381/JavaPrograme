package intigers;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Removing_Duplicates_in_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.next();
		LinkedHashSet<Object> st=new LinkedHashSet<Object>();
		for(int i=0;  i<s.length(); i++)
		{
			st.add(s.charAt(i));
		}
		for(Object ob:st)
		{
			System.out.print(ob);
		}

	}

}
