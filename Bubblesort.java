import java.util.*;
class Bubblesort
{
	public static void  sort(int a[])
	{
		for(int i=1;i<a.length;i++)
		{
			for(int j=0;j<a.length-i;j++)
			{
				if(a[j] > a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
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
		sort(a);
		System.out.println("\nAfter sorting Array:");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
	}
}