package MayCodingquestions;

public class IntergerAppearsTwoTimesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,8,3,4,5,5,4,6,7,8};
		
		
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			
			
			boolean check=false;
			
			for(int k=0;k<i;k++)
			{
				if(a[k]==a[i])
				{
					check=true;
					break;
				}
			}
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			
			if(count>=2)
			{
				System.out.println(a[i]);
			}
			
		}
		
		
		
	}

}
