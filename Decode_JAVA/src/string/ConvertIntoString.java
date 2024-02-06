package string;

import java.util.Scanner;

public class ConvertIntoString 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		String s = Integer.toString(n);
		System.out.println(s);
		
		//Calcute the number digit
		System.out.println(s.length());
	}

}
