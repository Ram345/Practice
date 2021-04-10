package practice;

public class Fibonacci2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//1, 1, 2, 3, 5, 8, 13, 21, 34, 55
		int count=10;
		for(int i=0;i<count;i++)
		{
			fib(i);
			System.out.println(i+" ");
		}
		
		
	}
	private static int fib(int i) 
	{
		// TODO Auto-generated method stub
		if(i<=1)
		return i;
		
		return (i-1)+(i-2);
		
		
	
}
}

