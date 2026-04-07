package Infosys;

public class IntegerAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=370;
		
		int value=num;
		int sum=0;
		
		while(num>1)
		{
			int r=num%10;
			
			num=num/10;
			
			sum=sum+r*r*r;
		}
			if(sum==value)
			{
				System.out.println("string are anagram");
			}
			else
			{
				System.out.println("string are not anagram");
			}
			
			
		
		
	}

}
