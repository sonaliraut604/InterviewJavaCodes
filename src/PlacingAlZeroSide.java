
public final class PlacingAlZeroSide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,0,3,4,5,6,7,0,10,11,0};
	
		int j=0;  //non zero element
		
		
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
			System.out.print(x+" ");
		}
		
		
		
		}
	
		
		

	

}
