package PractiseCode;

public class ReverseEachString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="sonali raut amar";
		
		String[] na=name.split(" ");
		
		String reverseString="";
		
		for(String words:na)
		{
			String reverseword="";
			
			for(int i=words.length()-1;i>=0;i--)
			{
				reverseword=reverseword+words.charAt(i);
			}
			
			
			reverseString=reverseString+reverseword+" ";	
			
		}
		System.out.println(reverseString);
		
		
		
		
		
		
		
		
	}

}
