import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n ;
		long factorial=1;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;++i)
		{
			factorial=factorial*i;
		}
		System.out.printf("the factorial of %d = %d", n,factorial);
		
	}
	
}
