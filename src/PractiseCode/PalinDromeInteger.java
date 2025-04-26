package PractiseCode;

public class PalinDromeInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num=12321;		
		int rev=0;
		
		int totalnum=num;
		
		while(num>0)
		{
			
			rev=rev*10+num%10;
			
			num=num/10;
			
		}
		
	   if(totalnum==rev)
	   {
		   System.out.println("palindrome:"+rev);
	   }
	   else
	   {
		   System.out.println("not a plaindrome");
	   }
	}

}
