package practice;

public class Maximum_Array {

	public static void main(String[] args) {
		int[] a= {7,9,2,8,5};
		for(int i=0;  i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[0]);
	}

}
