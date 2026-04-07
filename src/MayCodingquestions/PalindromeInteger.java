package MayCodingquestions;

import java.util.Scanner;

public class PalindromeInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num=sc.nextInt();
		
		int value=num;
		
		int rev=0;
		
		while(num>0) 
		{
			rev=rev*10+num%10;
			
			num=num/10;
		}
		
		if(rev==value)
		{
			System.out.println("Integer are palindrome");
		}
		
		else
		{
			System.out.println("Integer are not palindrome");
		}
	}

}
