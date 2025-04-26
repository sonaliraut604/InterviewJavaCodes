package PractiseCode;

public class MinAndMaxFromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,3,4,5,6,7,90};
		
		 int max=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
		
		
		
	}

}
