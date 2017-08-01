import java.util.*;
class smallest
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the element of the Array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int small=a[0];
		for(int i=0<;i<n;i++)
			{
				if(a[i]<small)
					small=a[i];
			}
			System.out.println("Smallest in the integer is"+small);
	}
}