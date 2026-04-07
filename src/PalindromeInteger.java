
public class PalindromeInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=11211;
		
		int rev=0;
		int ordernum=num;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			
			num=num/10;
			
		}
		
		if(ordernum==rev)
		{
			System.out.println("they are palindrome");
		}
		else
		{
			System.out.println("they are not palindrome");
		}
		
		
	}

}
