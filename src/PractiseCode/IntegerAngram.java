package PractiseCode;

public class IntegerAngram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num=370;
		
		int temp=num;
		int sum=0;
		
		while(num>0)
		{
			int r=num%10;
//			System.out.println(r);
			
			num=num/10;
			
			sum=sum+r*r*r;
				
		}
		if(temp==sum)
		{
			System.out.println("number is anagram");
		}
		else
		{
			System.out.println("number is not anagram");
		}
		
	}

}
