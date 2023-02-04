package my_programs;

import java.util.LinkedHashSet;

public class Count_Ocurance_in_Integer {

	public static void main(String[] args) {
		int[] n= {2,2,3,3,4,4,1,1};
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		for(Integer ob:n)
		{
			set.add(ob);
		}
		for(Integer oj:set)
		{
			int count=0;
			for(int i=0; i<n.length; i++)
			{
				if(oj==n[i])
				{
				count++;	
				}
			}
			if(count>1)
			
				System.out.println(oj+"----"+count);
			
		}
	}

}
