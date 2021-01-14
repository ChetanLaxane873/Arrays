
public class RemoveDuplicates 
{
	public static void main(String[] args)
	{
		int[] a= {1,2,3,4,8,1,2,3,48};
		int countDup=0;
		for(int i=0; i<a.length ;i++)
		{
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]==a[j])
				{
					countDup++;
					break;
				}
			}
		}
		
		int[] na = new int[a.length-countDup];
		for (int i = 0; i < na.length; i++) 
		{
			na[i]=Integer.MAX_VALUE;
		}
		
		System.out.println("Original");
		for(int p: a)
		{
			System.out.print(p+" "); 
		}
		System.out.println();
		
		int naInd=0;
		for(int i=0; i<a.length; i++)
		{
			boolean flag = true;
			for (int j = 0; j < na.length; j++)
			{
				if(a[i]==na[j])
				{
					flag = false;
				}
			}
			if(flag)
			{
				na[naInd]=a[i];
				naInd++;
			}
			
		}
		
		System.out.println("Unique Elements array: ");
		for(int p: na)
		{
			System.out.print(p+" "); 
		}
		System.out.println();
		System.out.println("Length of the aray is :"+na.length);
	}
}
