package PractiseCode;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="mada";
		
		String rev="";
		String newvalue=name;
		
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
			
		}
		if(newvalue.equals(rev))
		{
			System.out.println("string is palindrome:"+rev);
		}
		else
		{
			System.out.println("string is not palindrome:"+rev);
		}
		
		
	}

}
