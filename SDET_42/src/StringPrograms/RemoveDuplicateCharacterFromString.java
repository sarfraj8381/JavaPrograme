package StringPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharacterFromString {

	public static void main(String[] args) {
		String s="kannada";
			LinkedHashSet<Character> set = new LinkedHashSet<>();
		
				for(int i=0;i<s.length();i++)
				{ 
					set.add(s.charAt(i));
//					System.out.println(set); for my undestanding
				}
				for (Character ch : set) 
				{
					System.out.print(ch);
				}
	}

}
