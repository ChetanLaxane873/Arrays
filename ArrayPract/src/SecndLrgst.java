
public class SecndLrgst {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,67,8};
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<a.length; i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("Largest:"+max);
		int max2 = Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++)
		{
			if(max2<a[i] && a[i]!=max)
			{
				max2=a[i];
			}
		}
		System.out.println("Second Largest:"+max2);
	}
}
