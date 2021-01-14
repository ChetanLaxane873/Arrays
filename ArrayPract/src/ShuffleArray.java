import java.util.Random;

public class ShuffleArray {

	public static void main (String[] args)
	{
		int[] a = { 1, 2, 3, 4, 5, 6 };
        System.out.print("Original Array: ");
        for(int p: a)
        {
        	System.out.print(p+" ");
        }
        System.out.println();
		shuffle(a);
		System.out.print("Shuffle Array: ");
		for(int p: a)
        {
        	System.out.print(p+" ");
        }
	}
	public static void shuffle(int a[])
	{
		for (int i = 0; i < a.length; i++)
		{
			Random rand = new Random();

			int j = rand.nextInt(i + 1);

			swap_elements(a, i, j);
		}
	}
    private static void swap_elements(int[] a, int i, int j)
    {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
