
public class IntegerAnagrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 153=1cube+5 cube+3 cube 1+125+27=153 //370
//		
//		int num=370;
//		
//		int temp=num;
//		
//		int sum=0;
//	   
//		while(num>0)
//		{
//		int r=num%10;
//
//		num=num/10;
//		
//		sum=sum+r*r*r;
//		
//		}
//		if(temp==sum)
//		{
//			System.out.println("its a amstrong number");	
//     	}
//		else
//		{
//			System.out.println("not a amstrong number");
//		}
//		
//		
//		
		
		int num=370;
		
		int temp=num;
		
		int sum=0;
		
		for(int i=0;i<=num;i++)
		{
			int r=num%10;
			
			num=num/10;
			
			sum=sum+r*r*r;
			
		}
		System.out.println(sum);
		
		if(temp==sum)
		{
			System.out.println("number is anagram");
		}
		else
		{
			System.out.println("number not is anagram");
		}
		
		
		
		
	}

}
