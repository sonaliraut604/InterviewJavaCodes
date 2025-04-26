package NewPractiseCode;

public class IntegerAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=370;
		
		int count=num;
		int sum=0;
		
		for(int i=0;i<num;i++)
		{
			int r=num%10;
			num=num/10;
			
			sum=sum+r*r*r;
			
		}
		System.out.println(sum);
		
		if(count==sum)
		{
			System.out.println("number is anagram");
		}
		
		else
		{
			System.out.println("number is not anagram");
		}
	}

}
