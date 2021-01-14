
public class ReplaceEachWithProdOfOthers 
{
	public static void main(String[] args)
	{
		int[] a = {0,1,2,3,4,5,6,7};//1,2,3,4,5,6,7
		int[] na = new int[a.length];
		for(int i=0; i<a.length; i++)
		{
			int prod=1;
			for(int j=0; j<a.length; j++)
			{
				if(i==j)
				{
					continue;
				}
				else
				{
					prod=prod*a[j];
				}
			}
			na[i]=prod;
		}
		
		for(int p: na)
		{
			System.out.print(p+" ");
		}
	}
}
