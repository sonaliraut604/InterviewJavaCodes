package NewPractiseCode;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="madam";
		String rev="";
		String newname=name;
		
		
		for(int i=name.length()-1;i>=0;i--)
		{
		   rev=rev+name.charAt(i);
			
		}
		
		if(newname.equals(rev))
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("number is not palindrome");
		}
		
	}

}
