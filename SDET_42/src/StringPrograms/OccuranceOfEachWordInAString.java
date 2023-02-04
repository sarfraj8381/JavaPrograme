package StringPrograms;
import java.util.LinkedHashSet;

public class OccuranceOfEachWordInAString {

	public static void main(String[] args) {

		String str="i am from sdet42 i from batch";
		String[] s = str.split(" ");
		LinkedHashSet<String>set = new LinkedHashSet<String>();
		for(int i=0;  i<s.length;  i++)
		{
			set.add(s[i]);
		}
		for(String stri:set)
		{
			int count=0;
			for(int i=0;  i<s.length;  i++)
			{
				if(stri.equals(s[i]))
				{
					count++;
				}
			}
			System.out.println(stri+" = is repeat "+count+" time");
		}

	}

}
