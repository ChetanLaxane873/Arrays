public class SumZero
{
	public static void main(String[] args)
	{
		int[] a = {1, 3, -7, 3, 2, 3, 1, -3, -2, -2};//1, 2, -2, 3, 4, 5, 6//1, 2, -3, 4, 5, 6//1, 3, -7, 3, 2, 3, 1, -3, -2, -2
	
		for(int i=0; i<a.length; i++)
		{
			int sum=0;
			int count=0;
			for(int j=i; j<a.length; j++)
			{
				int si=i;
				int ei=j;
				sum=sum+a[j];
				count++;
				if(sum==0)
				{
					int subArr[] = new int[count];
					int ind=0;
					for(int k=si; k<=ei; k++)
					{
						subArr[ind]=a[k];
						ind++;
					}
					System.out.print("Sub Arrays with Sum = 0: ");
					for(int p: subArr)
					{
						System.out.print(p+" ");
					}
					System.out.println();
				}
				
			}
		}
		
	}
}
