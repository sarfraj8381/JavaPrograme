package StringPrograms;

import java.util.LinkedHashSet;

public class PrintUniqueWordsWithCount {

	public static void main(String[] args) {
		String str="i am from sdet42 i from batch";
		String[] s = str.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<>();
		
		for(int i=0;i<s.length;i++)
		{ 
			set.add(s[i]);
		}
		for(String st:set)
		{
			int count=0;
			for (int i = 0; i < s.length; i++)
			{
				if(st.equals(s[i]))
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(st+" = "+ count);
			}
		}
	}

}
