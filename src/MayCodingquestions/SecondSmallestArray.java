package MayCodingquestions;

import java.util.Arrays;

public class SecondSmallestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int num[]= {1,2,3,4,5,6,7,10};
//		
//		int temp;
//		
//		for(int i=0;i<num.length;i++)
//		{
//			for(int j=i+1;j<num.length;j++)
//			{
//				if(num[i]>num[j])
//				{
//					temp=num[i];
//					num[i]=num[j];
//				    num[j]=temp;
//				}
//			}
//		}
//		System.out.println(num[2]);
		
		int[] a= {1,2,3,5,0,9};
		
		Arrays.sort(a);
		
		System.out.println(a[1]);
	}

}
