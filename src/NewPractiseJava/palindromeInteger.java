package NewPractiseJava;

public class palindromeInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num=12121;
		int rev=0;
		
		int toatlnum=num;
		
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		
		
		if(toatlnum==rev)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("number is not palindrome");
		}
	}

}
