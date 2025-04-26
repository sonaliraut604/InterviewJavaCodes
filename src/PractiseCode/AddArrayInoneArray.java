package PractiseCode;

import java.util.Arrays;

public class AddArrayInoneArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {1,3,4,5,6};	
		int alog=a.length;
		
		int b[]= {7,9,0,7};
		int blog=b.length;
		
		int clog=alog+blog;
		
		int c[]=new int[clog];
		
		for(int i=0;i<alog;i++)
		{
			c[i]=a[i];
		}
		
		for(int i=0;i<blog;i++)
		{
			c[i+alog]=b[i];
		}
		System.out.println(Arrays.toString(c));
	}

}
