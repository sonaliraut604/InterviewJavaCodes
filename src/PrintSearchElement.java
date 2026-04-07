
public class PrintSearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,3,5,6,7,6,5,8,9};
		
		int serach=3;
		boolean found=false;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==serach)
			{
				System.out.println("Element are found:"+a[i]);
				found=true;
			    break;
			}
			
		}
		
		if(!found)
		{
			System.out.println("not found");
		}
		
		
	}

}
