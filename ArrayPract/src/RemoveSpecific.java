
public class RemoveSpecific {
	public static void main(String[] args) {
		int[] a = {1,2,34,4,6,34,7,34,6,5,6,34};
		
		int num=34;
		int count=0;
		
		for(int i=0; i<a.length; i++)
		{
			if(num==a[i])
			{
				count++;
			}
		}
		
		int ind=0;
		int[] na = new int[a.length-count];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]!=num)
			{
				na[ind]=a[i];
				ind++;
			}
		}
		
		for(int p : na)
		{
			System.out.print(p+" ");
		}
	}
}
