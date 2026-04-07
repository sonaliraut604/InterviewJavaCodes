package PractiseCode;

public class placethreechartoleft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {1,2,3,4,5,6,7,8,9};
		
		int k=3;
		
		for(int i=0;i<k;i++)
		{
			int first=a[0];
			
			for(int j=0;j<a.length-1;j++)
			{
				a[j]=a[j+1];
			}
			
			a[a.length-1]=first;
		}
		
		for(int x:a)
		{
			System.out.println(x);
		}
		

		
	}

}
