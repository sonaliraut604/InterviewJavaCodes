package Infosys;

public class PalindromeINtrger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=12321;
		
		int rev=0;
		
		int value=num;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;	
		}
		
	    System.out.println(rev);
	    
	    if(rev==value)
	    {
	    	System.out.println("string are palindrome");
	    }
	    else
	    {
	    	System.out.println("string are not palindrome");
	    }
	}

}
