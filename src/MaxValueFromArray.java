
public class MaxValueFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] a= {1,3,5,6,7,79,98};
		
		int max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]> max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
