
public class EvenOddInOneArr
{
	public static void main(String[] args)
	{
		int[] a = {2,3,4,5,6,12,6,4,9,19};
		
		int strt=0; 
		int end=a.length-1;
		while(strt<=end)
		{
			if(a[strt]%2!=0 && a[end]%2==0)
			{
				int temp = a[strt];
				a[strt]=a[end];
				a[end]=temp;
			}
			if(a[strt]%2==0)
			{
				strt++;
			}
			if(a[end]%2!=0)
			{
				end--;
			}
		}
		
		for(int p: a)
		{
			System.out.print(p+" ");
		}
	}
}
