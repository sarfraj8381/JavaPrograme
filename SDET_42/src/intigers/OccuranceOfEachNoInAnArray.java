package intigers;
import java.util.LinkedHashSet;

public class OccuranceOfEachNoInAnArray {

	public static void main(String[] args) {
		int[] a= {3,2,1,0,3,0};
		LinkedHashSet<Integer>set = new LinkedHashSet<Integer>();
				for(Integer in:a)
				{
					set.add(in);
				}
				for (Integer num : set) 
				{
					int count=0;
					for(int i=0; i<a.length;i++)
					{
						if(num==a[i])
							count++;
					}
					if(count>1)
						System.out.println(num+"---->"+count);
				}
	}

}
