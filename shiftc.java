import java.util.Scanner;
import java.io.*;
class shiftc
{
	public static void main(String[] args)
	{
		String input="Ankit";
		for(int i=0;i<input.length()-1;i++)
		{
			input=shift(input);
			System.out.println(input);
		}
	}
	public static String shift(String s)
	{
		return s.charAt(s.length()-1)+s.substring(0,s.length()-1);
	}
}