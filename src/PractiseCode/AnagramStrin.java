package PractiseCode;

import java.util.Arrays;


public class AnagramStrin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="tomato";
		String s2="matoto";
		
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		
		
		if(ch1.length!=ch2.length)
		{
			System.out.println("String are not anagram");
			System.exit(0);
		}

		Arrays.sort(ch1);
		System.out.println(ch1);
		
		Arrays.sort(ch2);
		System.out.println(ch2);
		
		
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]==ch2[i])
			{
				System.out.println("String are anagram");
				System.exit(0);
			}
		}
		
		
	}

}
