
public class Leader 
{
	public static void main(String[] args)
	{
		int[] a = {10,1,2,3,4,7,8,9,1,2,7,4,5,6};
		
		for(int i=0; i<a.length; i++)
		{
			boolean flag = true;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					flag = false;
				}
			}
			if(flag)
			{
				System.out.println("Leader is: "+a[i]);
			}
		}
	}
}
