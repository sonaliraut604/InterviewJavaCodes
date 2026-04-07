package MayCodingquestions;

public class EYInterviewQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
    /* 1 
     3 5
     7 9 11
     13 15 17 */

		
	int num=1;
	
	for(int i=1;i<5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(num +" ");
			num=num+2;
		}
		System.out.println();
	}
	
	
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=4;j++)
		{
			System.out.print("*");
			
		}
		System.out.println();
	}
	
	for(int i=1;i<=5;i++)
	{
//		System.out.println(i);
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
			
		}
		System.out.println();
	}
		
		
		

          
		
	}

}
