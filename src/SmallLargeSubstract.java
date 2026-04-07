
public class SmallLargeSubstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] a = {21,1,15,24,17,20};
		
		int max=a[0];
		int min=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		
			else if(a[i]>max) 
			{
				max=a[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
		System.out.println(max-min);
		

	}

}
