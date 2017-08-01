import java.util.Scanner;
import java.io.*;
class rotate
{
	public static void main(String[] args)
	{
		int c;
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		for(int i=0;i<input.length()-1;i++)
		{
			input=shift(input);
			System.out.println(input);
			if()
			++c;
		}
	}
	public static String shift(String s)
	{
		return s.charAt(s.length()-1)+s.substring(0,s.length()-1);
	}
}