package StringPrograms;

import java.util.LinkedHashSet;

public class CountVowelsPresentInAStringWithoutDuplicate {

	public static void main(String[] args) {
		String st = "india";
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for (int i = 0; i<st.length(); i++)
		{
			set.add(st.charAt(i));
		}
		int count=0;
		for (Character ch : set) 
		{
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
				System.out.println(ch);
			}
		}
		System.out.println(st+" = "+count);
	}

}
