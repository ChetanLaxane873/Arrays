
public class InterleavingChar {

	public static void main(String[] args) {
		
		char[] ca1={'a','b','c','d','a','b','c'};
		char[] ca2={'w','x','y','z','a','b','c','x','y','z'};
		
		char[] ca3=new char[ca1.length+ca2.length];
		boolean flag = false;
		int caind1=0;
		int caind2=0;
		for(int i=0; i<ca3.length; i++)
		{
				if(!flag)
				{
					ca3[i]=ca1[caind1];
					caind1++;
					
					if(i<ca2.length*2)
					{
						flag=true;
					}
					
					continue;
				}
				if(flag)
				{
					ca3[i]=ca2[caind2];
					caind2++;
					if(i<(ca1.length*2)-1)
					{
						flag=false;
					}
					continue;
				}

		}
		
		for(char p: ca3)
		{
			System.out.print(p+" ");
		}
	}
}
