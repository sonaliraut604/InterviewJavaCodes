package PractiseCode;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1="Listen";
		String s2="Silent";
		
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		
		if(ch1.length !=ch2.length)
		{
			System.out.println("Not a anagram");
			System.exit(0);
			
		}
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]!=ch2[i])
			{
				System.out.println("no a anagram");
				System.exit(0);
			}
		}
		System.out.println("its a anagram");
		
		
		
	}

}
