import java.util.Scanner;
class string1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		String s=sc.next();
		char letter=s.charAt(0);
		System.out.println("Character at first position"+letter);
		char[] arr=s.toCharArray();
		int l=s.charAt(0);
		System.out.println("ASCI Value of the character is  "+l);
	}
}