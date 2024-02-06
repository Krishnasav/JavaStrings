package string;

import java.util.Scanner;

public class InputString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name:" +" ");
		String str = sc.nextLine();
		System.out.print("Hello" +" ");
		System.out.println(str);
		
	}

}
