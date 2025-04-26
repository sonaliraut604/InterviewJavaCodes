
public class ReverseEachString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="sonali amar raut";
		
		String[] str=name.split(" ");
		
		String reverseString="";
		
		
		for(String words:str)
		{
			String reverseWord="";
			
			
			for(int i=words.length()-1;i>=0;i--)
			{
				reverseWord=reverseWord+words.charAt(i);
			}
			
			reverseString=reverseString+reverseWord+" ";
		}
		System.out.println(reverseString);
		
	}

}
