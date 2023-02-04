package my_programs;

public class Second_Third_Max {

	public static void main(String[] args) {
		int[] a= {3,5,6,7,2};
		int fmax=0;
		int smax=0;
		int tmax=0; 
		
		for(int i:a)
		{
			if(i>fmax)
			{
				tmax=smax;
				smax=fmax;
				fmax=i;
			}
			else if(i>smax)
			{
				tmax=smax;
				smax=i;
			}
			else if(i>tmax)
			{
				tmax=i;
			}
		}
		System.out.println(smax);
		System.out.println(tmax);
	}}
