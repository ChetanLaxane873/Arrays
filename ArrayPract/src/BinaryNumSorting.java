public class BinaryNumSorting
{
	public static void main(String[] args)
	{
		int[] a = {0,1,1,0,1,1,0,1,0,0};
		int k=0;
		for(int i=0; i<a.length ; i++)
		{
			if(a[i]==0)
			{
				a[k]=0;
				k++;
			}
		}
		
		for(int i=k; i<a.length ; i++)
		{
			a[k]=1;
			k++;
		}
	}	
}
