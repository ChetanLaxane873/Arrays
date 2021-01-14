
public class SaddlePoint 
{
	public static void main(String[] args)
	{		
		int[][] a = {{1,2,3},
					 {4,5,6},
					 {4,1,3}};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				if(isSmallestInRow(a,i,j) && isGreatestInCol(a,i,j))
				{
					System.out.println("Saddle Point is: "+a[i][j]);
				}
			}
		}
	}

	private static boolean isGreatestInCol(int[][] a, int i, int j) 
	{
		boolean flag=true;
		for (int k = 0; k < a.length; k++)
		{
			if(a[i][j]<a[k][j])
			{
				flag=false;
			}
		}
		return flag;
	}

	private static boolean isSmallestInRow(int[][] a, int i, int j)
	{
		boolean flag=true;
		for (int k = 0; k < a.length; k++)
		{
			if(a[i][j]>a[i][k])
			{
				flag=false;
			}
		}
		return flag;
	}
}
