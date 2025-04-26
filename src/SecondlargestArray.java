
public class SecondlargestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {100,200,300,400,600,900};
		int temp;
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			
		}
		System.out.println("second largest array: "+a[1]);
	  	
	}

}
