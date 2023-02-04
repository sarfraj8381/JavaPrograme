package my_programs;

import java.util.LinkedHashSet;

public class Unique {

	public static void main(String[] args) {
		String s="aabbaxxbccs";
		
//		LinkedHashSet<String> set=new LinkedHashSet();
		for(int i=0; i<s.length(); i++)
		{
			 boolean uni = true;
//			set.add(s);
			for(int j=0; j<s.length(); j++)
			{
				if(s.charAt(i)==s.charAt(j) &&i!=j)
				{
					uni=false;
					break;
				}
			}
			if(uni==true)
			System.out.print(s.charAt(i));
		}
		

	}

}
