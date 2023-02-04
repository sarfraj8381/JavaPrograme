package intigers;

public class Find_1St_Min_And_2Nd_Min_Length_Withot_BubbleSort {

	public static void main(String[] args) {
		int[] a= {7,4,0,2,1};		//Output:-  First_Min=0  Second_Min=1
		int fmin=a[0];
		int smin=a[0];
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]<=fmin)
			{
				if(a[i]!=fmin)
				{
					smin=fmin;
				}
				fmin=a[i];
			}
				else if(fmin==smin ||smin>a[i])
				{
					smin=a[i];
				}
			}
			System.out.print("First_Min="+fmin+"  Second_Min="+smin);
		}
	}


