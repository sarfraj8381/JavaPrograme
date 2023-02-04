package practice;

import java.util.LinkedHashSet;

public class Unique_String {

	public static void main(String[] args) {
		String s="sarfraj";
		LinkedHashSet<Object> set= new LinkedHashSet<>();
		for(int i=0; i<s.length(); i++)
		{
			set.add(s.charAt(i));
		}
		for(Object ob: set)
		{
			System.out.println(ob);
		}
	}

}
