
public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name="sonalin raut amar";
		
		String[] ch=name.split("");
		
		String reverseString="";
		
		
		
	   for(String words:ch)
	   {
		String reversewords="";
		
		
		for(int i=words.length()-1;i>=0;i--)
		{
			reversewords=reversewords+words.charAt(i);
			
		}
		reverseString=reverseString+reversewords+"";
	   }
	  System.out.println(reverseString);
		
	}

}
