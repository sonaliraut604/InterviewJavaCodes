
public class PalindromeInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=12321;
		
		int rev=0;
		int ordernum=num;
		
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		
		if(ordernum==rev)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("number is not palindrome");
		}
	}

}
