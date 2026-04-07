import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number");
//		
		int num=11;
		
		int count=1;
		
	
		
		for(int i=1;i<num;i++)
    {
			if(num%i==0)
			{
				count++;
			}
	}
		
		if(count==2)
		{
			System.out.println("prime number "+num);
		}
		else
		{
			System.out.println("not prime number "+num);
		}
		
	}
	}


