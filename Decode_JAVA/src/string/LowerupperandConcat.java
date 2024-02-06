package string;

public class LowerupperandConcat 
{
	public static void main(String[] args) 
	{
		//Lowercase and Uppercase
		String s = "KRISHNA SAV IS 24 YEARS OLD ";
		s= s.toLowerCase();
		System.out.println(s);
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		//Concat() method
		
		String a = "kri";
		String b = "shna";
		System.out.println(a.concat(b));
		a = a.concat(b);
		System.out.println(a);
		
		
	}

}
