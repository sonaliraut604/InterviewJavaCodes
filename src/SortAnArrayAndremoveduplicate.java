import java.util.HashSet;

public class SortAnArrayAndremoveduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,4,6,8,9,3,10,0,4,9,10};
		
		int temp;
		
		HashSet<Integer> set=new HashSet<Integer>();
		
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
			set.add(a[i]);
			
		}
		
		System.out.print(set);
		

		

		
	}
}
