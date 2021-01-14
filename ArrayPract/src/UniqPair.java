
public class UniqPair
{
	public static void main(String[] args)
	{
		int[] a = {1,1,3};
		int count=0;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					count++;
					break;
				}
			}
		}
		
		int[] na = new int[a.length-count];
		count=0;
		
		for(int i=0; i<a.length; i++)
		{
			boolean flag =true;
			for(int j=0; j<na.length; j++)
			{
				if(na[j]==a[i])
				{
					flag=false;;
				}
			}
			if(flag)
			{
				na[count] = a[i];
				count++;
			}
		}
	
		count=0;
		for(int i=0; i<na.length; i++)
		{
			for(int j=0; j<na.length ;j++)
			{
				System.out.println("("+na[i]+","+na[j]+")");
				count++;
			}
		}
		System.out.println(count);
	}
}
