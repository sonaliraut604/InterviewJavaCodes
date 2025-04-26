package NewPractiseJava;

public class SecondLargestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {100,900,800,300,600,200};
		int temp=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[1]=a[j];
					a[j]=temp;
				}
				
		   }
			System.out.println(a[1]);
		}
		
		
	}

}
