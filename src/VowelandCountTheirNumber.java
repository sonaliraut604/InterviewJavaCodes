
public class VowelandCountTheirNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "I Like Java Programming";
		
		int vowel=0;
		
		String[] ch=input.split(" ");
		
		for(String word:ch)
		{
			for(char value:word.toCharArray())
			{
				if( value=='a'||value=='e'||value=='i'||value=='o'||value=='a')
				{
					vowel++;
				}
			}
			System.out.println(word.toLowerCase()+"-" +vowel);
			
			
		}
		
		
	}

}
