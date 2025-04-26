package NewPractiseJava;

public class MinAndMaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num= {1,2,3,4,5,6,7,7,8,110,6};
		
		int max=num[0];
		
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>max)
			{
				max=num[i];
			}
		}
		System.out.println(max);
		
		
		int min=num[0];
		
		for(int i=0;i<num.length;i++)
		{
			if(num[i]<min)
			{
				min=num[i];
			}
		}
		System.out.println(min);
		
	}

}
