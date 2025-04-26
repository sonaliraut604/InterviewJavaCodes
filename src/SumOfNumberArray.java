
public class SumOfNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {1,3,4,5,6,7,9,4,3,6,7};
		
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			count=count+a[i];
		}
		System.out.println(count);
	}

}
