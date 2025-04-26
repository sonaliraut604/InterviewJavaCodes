package NewPractiseJava;

public class ReverseEachString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="sonali amar raut";
		
		String[] ch=name.split(" ");
		
		String Reversestring="";
		
		for(String chew:ch)
		{
			String reverseword="";
			
			for(int i=chew.length()-1;i>=0;i--)
			{
				reverseword=reverseword+chew.charAt(i);
			}
			
			Reversestring=Reversestring+reverseword+" ";
		}
		
		System.out.println(Reversestring);
	}

}
