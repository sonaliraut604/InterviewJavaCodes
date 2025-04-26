package PractiseCode;

public class Anabumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=370;
		
		int temp=num;
		
		int sum=0;
		
		while(num>0)
		{
			int r=num%10;
			num=num/10;
			
			sum=sum+r*r*r;
			
		}
		System.out.println(sum);
		
	}

}
