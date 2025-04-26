package NewPractiseCode;

public class MaxAndMinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,4,6,7,9,45,98};
		
		int max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
		
		
		int min=a[0];
		
	  for(int i=0;i<a.length;i++)
	  {
		  if(a[i]<min)
		  {
			  min=a[i];
		  }
	  }
	  System.out.println(min);
	}

}
