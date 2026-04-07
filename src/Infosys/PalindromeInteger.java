package Infosys;

public class PalindromeInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=1221;
		
		int rev=0;
		
		int value=num;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		
		System.out.println(rev);
		 
		if(value==rev)
		{
			System.out.println("string are palindrome");
		}
		
		else
		{
			System.out.println("string are not palindrome");
		}
	}

}
