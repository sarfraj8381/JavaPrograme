package StringPrograms;
import java.util.LinkedHashSet;

public class PrintDuplicateCharacterWithCount {
	public static void main(String[] args) {
		String s="tester";
		LinkedHashSet<Character>set = new LinkedHashSet<Character>();
		
		for(int i=0;  i<s.length();  i++)
		{
			set.add(s.charAt(i));
		}
		for(Character ch:set) {
			int count=0;
			for(int i=0;  i<s.length();  i++) {
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(ch+" is repeating "+count+" =time");
			}
	        }
	}
}