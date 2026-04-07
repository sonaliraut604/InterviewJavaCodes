         import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//listen==silent means anagram
		
		
		String s1="LISTEN";
		String s2="SILENT";

	
		
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]==ch2[i])
			{
				System.out.println("Anagaram");
				System.exit(0);
			}
		}
		System.out.println("not Anagram");
		
		
		
		
	}

}
