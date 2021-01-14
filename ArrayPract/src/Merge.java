
public class Merge 
{
	public static void main(String[] args)
	{
		int[] a = {1,2,3,4,5};
		int[] b = {6,7,8};
		
		int[] c = new int[a.length+b.length];
		int bin=0;
		for(int i=0; i<c.length; i++)
		{
			if(i<a.length)
			{
				c[i]=a[i];
			}
			else
			{
				c[i]=b[(-1)*(a.length-i)];
			}
		}
		
		for(int p: c)
		{
			System.out.print(p+" ");
		}
		
	}
}
