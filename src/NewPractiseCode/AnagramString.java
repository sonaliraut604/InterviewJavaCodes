package NewPractiseCode;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		
		
		String s1="LISTEN";
		String s2="SILEN";
		
		char[] p1=s1.toCharArray();
		char[] p2=s2.toCharArray();
		
		
		if(p1.length!=p2.length)
		{
			System.out.println("String are not anagram");
			System.exit(0);
			
		}
		
		Arrays.sort(p1);
		Arrays.sort(p2);
		
	for(int i=0;i<p1.length;i++)
	{
		if(p1[i]!=p2[i])
		{
			System.out.println("String are not anagram");
			System.exit(0);
		}
	}
	System.out.println("string are anagram");

	}
}
