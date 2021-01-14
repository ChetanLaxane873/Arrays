
public class BinarySeRCH {
	public static void main(String[] args)
	{
		int[] a = {1,4,6,7,9,10,11,20};
		
		int num=21;
		
		int min=0;
		int max=a.length-1;
		
		int mid=0;
		boolean found=true;
		while(min<=max)
		{
			mid=(min+max)/2;
			
			if(num==a[mid])
			{
				System.out.println("Element Found at "+mid);
				found=false;
				break;
			}
			
			if(num>a[mid])
			{
				min=mid+1;
			}
			
			if(num<a[mid])
			{
				max=mid-1;
			}
		}
		if(found)
		{
			System.out.println("Element Not found");
		}
		
	}
}
