import java.util.Scanner;
class fibonacci
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number upto which you want fibonacci series");
		int n=sc.nextInt();
		int first=0;
		int second=1;
		if(n==0)
		{
			System.out.println("Enter value greater than 0");
		}
		 else if(n==1)
		{
		System.out.println(first);

		}
		else
		{
			System.out.println(first);
		System.out.println(second);
		for(int i=0;i<n-2;i++)
		{
		


			int next=first+second;
			first=second;
			second=next;
			System.out.println(next);
		}
	}
	}
}