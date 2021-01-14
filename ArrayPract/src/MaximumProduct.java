
public class MaximumProduct {

	public static void main(String[] args)
	{
		int[] a = {2, 3, 5, 7, -7, 5, 8, -5};
		int max=Integer.MIN_VALUE;
		int first=0;
		int secnd=0;
		for(int i=0; i<a.length; i++)
		{
			int prod=1;
			for(int j=i+1; j<a.length; j++)
			{
				prod=a[i]*a[j];
				if(max<prod)
				{
					max=prod;
					first=a[i];
					secnd=a[j];
				}
			}
		}
		System.out.println("Pair is: "+"("+first+","+secnd+")"+","+" Maximum Product: "+max);
	}
}
