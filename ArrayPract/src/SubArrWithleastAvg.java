
public class SubArrWithleastAvg  
{
	static int[] a={3,7,90,20,5,50,40};
	static int k=3;
	
	public static void main(String[] args)
	{
		double avg=0;
		double min=Integer.MAX_VALUE;
		int minInnd=0;
		for(int i=0; i<a.length-k; i++)
		{
			avg = findSubArrAvg(i);
			if(min>avg)
			{
				min=avg;
				minInnd=i;
			}
			
		}
		
		System.out.println("Average: "+min+" Index: "+minInnd);
	}

	private static double findSubArrAvg(int i)
	{
		double sum=0;
		for(int j=i; j<i+k; j++)
		{
			sum=sum+a[j];
		}
		return (sum/k);
	}
}
