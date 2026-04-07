package MayCodingquestions;

public class Palindromestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="madam";
		
		String rev="";
		
		String value=name;
		
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
		
		if(rev.equals(value))
		{
			System.out.println("String are palindrome");
		}
		else
		{
			System.out.println("String are not palindrome");
		}
		
		
		
		
	}

}
