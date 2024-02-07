package studio3;
import java.lang.reflect.Array;
import java.util.Scanner;
public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What's the largest number?");
		int n = in.nextInt();
		boolean[] prime = new boolean[n-1];
		int[] a = new int[n-1];
		int[] b = new int[n-1];
		for(int z = 0; z<prime.length; z++)
		{
			prime[z]=true;
		}
		for(int x = 2; x<n;x++)
		{
			a[x-2]= x;
			
		}
		for (int i = 0; i<a.length; i+=2)
		{
		prime[i]=false;	
		}
		for (int i = 0; i<a.length; i+=3)
		{
		prime[i]=false;	
		}
		for(int d = 0; d<prime.length;d++)
		{
			if(prime[d] == true)
			{
				b[d] = a[d]; 
						
			}
			System.out.println( b[d]);
		}
	}

}
