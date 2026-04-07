package Infosys;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="SILENT";
		String s2="LISTE";
		
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		
		
		if(ch1.length!=ch1.length)
		{
			System.out.println("string are not anagram");
			System.exit(0);
		}
		
		Arrays.sort(ch1);
		
		Arrays.sort(ch2);
		
		
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1.length==ch2.length)
			{
				System.out.println("string are anagram");
				System.exit(0);
			}
		}
	}

}
