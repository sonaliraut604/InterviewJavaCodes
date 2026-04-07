package MayCodingquestions;

public class SecondLargestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num= {1,3,5,6,7,19,10};
		int temp;
		
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]<num[j])
				{
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
					
				}
			}
			
		}
		System.out.println("secod largest array "+num[2]);
	}

}
