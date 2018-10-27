import java.util.*;
class max
{
	public static int maximum(int a[])
	{
		int max=a[0];
		
			for(int j=0;j<a.length;j++)
			{
				if(a[j] > max)
				{
					max=a[j];
				}
			}
			return max;
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n for size of array");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter Elements");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Entered Array");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		int c=maximum(a);
		System.out.println("\nMaximum value: "+c);
		
		
	}
}