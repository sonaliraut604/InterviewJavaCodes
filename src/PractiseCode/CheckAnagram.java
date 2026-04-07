package PractiseCode;
import java.util.Arrays;

public class CheckAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="LISTEN";
		String s2="SILENT";

		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		System.out.println("String are anagram: "+ Arrays.equals(ch1, ch2));
		
		
		
		
	}

}
