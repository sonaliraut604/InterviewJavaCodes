package PractiseCode;

public class placingzerooneside {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {1,2,3,0,4,0,5,6,0,1,0};
		
		int j=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
			a[j]=a[i];
			j++;
			}			
		}
		
		
		for(int i=j;i<a.length;i++)
		{
			a[i]=0;
		}
		
		for(int x:a)
		{
			System.out.println(x);
		}
		
	
	}

}
