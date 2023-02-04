package my_programs;
public class Find_2Nd_Max_And_3Rd_Max {
	public static void main(String[] args) {
		int[] a= {5,2,1,4,3};
		int fmax=0;
		int smax=0;
		int tmax=0;
		for (int i : a) 
		{
		    if (i > fmax) 
		    {
		    	tmax = smax;
		        smax = fmax;
		        fmax = i;
		    } 
		    else if (i > smax) 
		    {
		    	tmax = smax;
		    	smax = i;
		    }
		    else if (i > tmax) 
		    {
		    	tmax = i;
		    }
		}
		System.out.println("Second Maximum: " + smax);
		System.out.println("Third Maximum: " + tmax);
	}
}
