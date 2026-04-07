package Infosys;

public class ReverseEachString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="sonali amar raut";
		
		String[] value=name.split(" ");
		
		String reverseString="";
		
		for(String word:value)
		{
			
			String reverseWord="";
			
			for(int i=word.length()-1;i>=0;i--)
			{
				reverseWord=reverseWord+word.charAt(i);
				System.out.println(reverseWord);
			}
			
			reverseString=reverseString+reverseWord+" ";
		}
		System.out.println(reverseString);

}
}
