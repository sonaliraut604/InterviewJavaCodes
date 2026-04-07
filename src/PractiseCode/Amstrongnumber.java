package PractiseCode;

public class Amstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=370;
		
		int val=num;
		
		int sum=0;
		
		for(int i=0;i<=num;i++)
		{
			int r=num%10;
			
			num=num/10;
			
			System.out.println(num);
			
			sum=sum+r*r*r;
			
		}
		System.out.println(sum);
		
		
		if(sum==val)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

}
