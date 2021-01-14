
public class PositiveNegative
{
	public static void main(String[] args)
	{
		int[] a = {4,5,-8,1,-9,2,-5,34,-2};
		int strt=0; 
		int end=a.length-1;
		
		while(strt<=end)
		{
			if(a[strt]<0 && a[end]>=0)
			{
				int temp = a[strt];
				a[strt]=a[end];
				a[end]=temp;
			}
			if(a[strt]>0)
			{
				strt++;
			}
			if(a[end]<0)
			{
				end--;
			}
		}
		
//		int pcnt=0;
//		for(int i=0; i<a.length; i++)
//		{
//			if(a[i]>=0)
//			{
//				pcnt++;
//			}
//		}
//		System.out.println(pcnt);
//		int naind=0;
//		int na[] = new int[a.length];
//		for(int i=0; i<a.length; i++)
//		{
//			if(a[i]>=0)
//			{
//				na[naind]=a[i];
//				naind++;
//			}
//			else if(a[i]<0)
//			{
//				na[pcnt]=a[i];
//				pcnt++;
//			}
//		}
		for(int p : a)
		{
			System.out.print(p+" ");
		}
	}
}
