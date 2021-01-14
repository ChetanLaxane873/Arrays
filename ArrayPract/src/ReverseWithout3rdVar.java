
public class ReverseWithout3rdVar {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8};
		int n =a.length;
		for(int i=0; i<n/2; i++)
		{
			a[i]=a[i]+a[n-i-1];
			a[n-i-1]=a[i]-a[n-i-1];
			a[i]=a[i]-a[n-i-1];
			
			//6,7 a=6 b=7
			//a=a+b  ---> a=13
			//b=a-b ----> b=13-7=6
			//a=a-b ----> a=13-6=7
		}
		for(int p : a)
		{
			System.out.print(p+" ");
		}
	}
}
