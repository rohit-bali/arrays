import java.util.*;
class row_wise
{
	public static void main(String ars[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=s.nextInt();
		int a[][]=new int[n][n];
		System.out.println("Enter your elements");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
	
		System.out.println("After waveform");
		for(int i=0;i<n;i++)
		{
			if(i%2!=0)
			{
				for(int j=n-1;j>=0;j--)
				{
				System.out.print(a[i][j]+" ");
				}
			}
			else
			{
				for(int j=0;j<n;j++)
				{
				System.out.print(a[i][j]+" ");
				}
			}

		}
		
	}
}