package NewPractiseCode;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="sonali amar raut";
		String[] ch=name.split(" ");
		
		String reverseString="";	
		
		
		for(String words:ch)
		{
			String ReverseWord="";
			
			
			for(int i=words.length()-1;i>=0;i--)
			{
				
				ReverseWord=ReverseWord+words.charAt(i);
			}
			
			reverseString=reverseString+ReverseWord+" ";
			
			
		}
		System.out.println(reverseString);
		
	}

}
