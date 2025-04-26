package NewPractiseJava;

public class AnagramNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num=370;
		
		int toatlnum=num;
		int sum=0;
		
		while(num>0)
		{
		  int r=num%10;
		  
		  num=num/10;
		  
		  sum=sum+r*r*r;
		}
		System.out.println(sum);
		
		if(toatlnum==sum)
		{
			System.out.println("Number is anagram");
		}
		
		else
		{
			System.out.println("number is not anagram");
		}
		

	}

}
