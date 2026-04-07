package MayCodingquestions;

public class MaxandMinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {1,2,4,5,90,70,91};
		
		int max=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		System.out.println(max);
		
		
		int b[]= {23,4,5,6,78,0};
		
		int min=b[0];
		
		for(int i=1;i<b.length;i++)
		{
			if(b[i]<min)
			{
				min=b[i];
			}
		}
		System.out.println(min);
	}

}
