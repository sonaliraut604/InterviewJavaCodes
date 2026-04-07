package Infosys;

import java.util.Scanner;

public class CountTheWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String name=sc.nextLine();
		
		int count=1;
		
		for(int i=1;i<name.length();i++)
		{
			if(name.charAt(i)==' ' && name.charAt(i+1)!=' ')
			{
				count++;
			}
		}
		System.out.println(count);
		
		
	}

}
