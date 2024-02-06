package string;

public class Substring 
{
	public static void main(String[] args) {
		
		String s ="abcde";
		System.out.println(s.substring(1));
		System.out.println(s.substring(1,4));
		System.out.println(s.substring(2,2));
		System.out.println(s.substring(0,5));
		
		//Print All Substring
		
		for(int i =0;i<s.length();i++)
		{
			for(int j =i+1;j<s.length();j++)
			{
				System.out.println(s.substring(i,j));
			}
			System.out.println();
		}
	}

}
