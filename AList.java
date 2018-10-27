import java.util.*;
class Alist
{
	private static ArrayList <Integer> check(int[] arr1, int[] arr2)
	{
		
		int i=0, j=0;
		ArrayList<Integer> al = new ArrayList<>();
		while(i < arr1.length && j < arr2.length)
		{
			if(arr1[i] == arr2[j]){
				al.add(arr1[i]);
				i++;
				j++;
			}
			else
			{
				if(arr1[i] > arr2[j])
					j++;
				else
					i++;
			}
		}
		return al;

	}
	
	private static void display(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	private static void sort(int[] arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i;j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements");
		int N = sc.nextInt();
		int arr1[] = new int[N];
		System.out.println("Enter elements for array 1");
		for(int i=0;i<N;i++)
			arr1[i] = sc.nextInt();
		
		int arr2[] = new int[N];
		System.out.println("Enter elements for array 2 :-");
		for(int i=0;i<N;i++)
			arr2[i] = sc.nextInt();
		
		System.out.println("\nEntered array 1");
		display(arr1);
		
		System.out.println("\nEntered array 2");
		display(arr2);
		
		sort(arr1);
		sort(arr2);
		
		ArrayList <Integer> al = check(arr1, arr2);
		System.out.println("After Intersection ArrayList : " + al);
		
		System.out.println();
	}
}