package MayCodingquestions;

public class FindSumOfTillNumberArrY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {2,4,3,5,10,1,8};
		
		int target=12;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==target)
				{
					System.out.println("sum of pair is:"+"("+a[i]+","+a[j]+")");
				}
			}
		}
		
		
		
	}

}
