
public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name="madam";
		String rev="";
		
		String newvalue=name;
		
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
		
		if(newvalue.equals(rev))
		{
			System.out.println("string are palindrome :"+newvalue);
		}
		else
		{
			System.out.println("string are not palindrome :"+newvalue);
		}
	}

}
