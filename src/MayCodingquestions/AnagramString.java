package MayCodingquestions;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="SILENT"; 
		String s2="LISTEN";
		
		
		//converting this string into array
		
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		
		
		if(ch1.length!=ch2.length)
		{
			System.out.println("string are not anagram");
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
//		System.out.println("String are angram");
		
		
	}

}
