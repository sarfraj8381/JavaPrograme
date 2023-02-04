package intigers;

import java.util.LinkedHashSet;

public class UniqueNumberInAnArray {

	public static void main(String[] args) {
		int[] a= {3,2,1,1,2,1};
		
		LinkedHashSet<Integer>set = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++)
		{
			set.add(a[i]);
			
		}
		for (Integer inte : set) 
		{
			
			System.out.println(inte);
		}
	}

}
