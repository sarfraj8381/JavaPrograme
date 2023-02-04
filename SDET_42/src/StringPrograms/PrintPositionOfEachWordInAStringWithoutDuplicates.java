package StringPrograms;

import java.util.LinkedHashSet;

public class PrintPositionOfEachWordInAStringWithoutDuplicates {

	public static void main(String[] args) {
		String str="i am from sdet42 i from batch";
		String[] s = str.split(" ");
		LinkedHashSet<String>set = new LinkedHashSet<>();
		
		for(int i=0;  i<s.length;  i++)
		{
			set.add(s[i]);
		}
		for (String stri : set)
		{
		for (int i = 0; i < s.length; i++) 
		{
		if(stri.equals(s[i]))
		{
			System.out.println(stri+" = is present in position "+(i+1));
			break;
		}
		}	
		}
	}

}
