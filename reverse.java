import java.util.*;
class reverse
{
	public static void rev(int a[])
	{
		int i=0;
		int j=a.length-1;
		while(i<=j)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
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
		rev(a);
				System.out.println("\nAfter reversing Array:");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}
}