
public class ArrayOfObj 
{
	public static void main(String[] args)
	{
		Student s1 = new Student(1, "A", 20);
		Student s2 = new Student(2, "B", 21);
		Student s3 = new Student(3, "C", 26);
		Student s4 = new Student(4, "D", 70);
		Student s5 = new Student(5, "E", 30);
		Student s6 = new Student(6, "F", 50);
		Student s7 = new Student(7, "G", 10);
		Student s8 = new Student(8, "H", 39);
		Student s9 = new Student(9, "I", 44);
		Student s10 = new Student(10, "J", 69);
		
		
		Student[] sa  = {s5,s2,s6,s9,s8,s1,s4,s7,s10,s3};
		int high=0;
		for(int i=0; i<sa.length; i++)
		{
			high=i;
			for(int j=i+1; j<sa.length; j++)
			{
				if(sa[high].getMrks()<sa[j].getMrks())
				{
					high=j;
				}
			}
			Student temp=sa[i];
			sa[i]=sa[high];
			sa[high]=temp;
			
		}
		
		for(Student p : sa)
		{
			System.out.println(p);
		}
	}
}
