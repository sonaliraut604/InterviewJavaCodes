
public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 153=1cube+5 cube+3 cube 1+125+27=153 //370
	
		
		
		int num=370;
		
		int temp=num;
		
		int sum=0;
		
		for(int i=0;i<=num;i++)
		{
			int r=num%10;
			System.out.println(r);
			
			num=num/10;
			
			sum=sum+r*r*r;
			
		}
		System.out.println(sum);
		
		if(temp==sum)
		{
			System.out.println("number is amstrong");
		}
		else
		{
			System.out.println("number not is amstrong");
		}
		
		
		
		
	}

}
