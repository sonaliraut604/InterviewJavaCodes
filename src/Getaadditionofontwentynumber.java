
public class Getaadditionofontwentynumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,30,40,20,50,60};
		
		
		int sum=0;
		
		for(int val:a)
		{
			if(val%20==0)
			{
				sum=sum+val;
			}
		}
		System.out.println(sum);
		
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]%20==0)
//			{
//				sum=sum+a[i];
//			}
//		}
//		System.out.println(sum);
	}

}
