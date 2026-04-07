
public class ReverseEachWordAndUpperfirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name="sonali ghhh bbhh hhjj njjj";
		
		String[] val=name.split(" ");
		
		String reverseString="";
		
		
		for(String word:val)
		{
			String reverseword="";
			
			if(word.equals("ghhh")|| word.equals("njjj"))
			{
			for(int i=word.length()-1;i>=0;i--)
			{
				reverseword=reverseword+word.charAt(i);
			}
			}
			else
			{
				reverseword=word;
			}
			
			reverseword=reverseword.substring(0,1).toUpperCase()+reverseword.substring(1).toLowerCase();
			
			reverseString=reverseString+reverseword+" ";
		}
		System.out.println(reverseString);
	}

}
