package string;

public class IndexOfandCompareOf 
{
	public static void main(String[] args) 
	{
		//index of method
		String s = "Krishna Sav";
		System.out.println(s.indexOf('n'));
		System.out.println(s.indexOf('a'));
		System.out.println(s.lastIndexOf('a'));
		
		
		//CompareTo method
		String a = "abc";
		String b = "dbc";
		System.out.println(a.compareTo(b));
		
		//contains()-and-startsWith()
		String k = "Krishna is a Software Engineer";
		System.out.println(k.contains("Kris"));
		System.out.println(k.startsWith("Kri"));
		System.out.println(k.endsWith("neer"));
		
		
	}
	

}
