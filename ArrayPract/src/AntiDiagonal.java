
public class AntiDiagonal {
	public static void main(String[] args)
	{
		int[][] a = {{1,2,3},
					 {4,5,6},
					 {7,8,9}};
		for(int k=0; k<=4; k++)
		{
			for(int i=0; i<a.length; i++)
			{
				for(int j=0 ;j<a[i].length; j++)
				{
					if(i+j==k)
					{
						System.out.print(a[i][j]);
					}
				}
			}
			System.out.println();
		}
	}
}
