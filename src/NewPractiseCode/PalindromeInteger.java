package NewPractiseCode;

public class PalindromeInteger {

	public static void main(String[] args) {
	
   int num=12122;
   int rev=0;
   int newvalue=num;
   
   while(num!=0)
   {
	   rev=rev*10+num%10;
	   num=num/10;
	   
   }
   if(newvalue==rev)
   {
	   System.out.println("number is palindrome");
   }
   else
   {
	   System.out.println("number is not palindrome");
   }
		
	}

}
