
public class ReverseStringwithoutmiddleword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="sonali amar swati raut";
		
		String[] str=name.split(" ");
		
		String reversestring="";
		
		for(String word:str)
		{
			String reverseword="";
			
			if(word.equals("sonali")|| word.equals("amar")|| word.equals("raut"))
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
			
			reversestring=reversestring+reverseword+" ";
		}
		
		System.out.println(reversestring);
		
	}

}
