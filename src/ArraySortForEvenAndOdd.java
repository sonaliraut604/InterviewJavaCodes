
public class ArraySortForEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {6,1,9,5,3,2,4};
	
		
		int[] arr2=new int[arr.length];
		
		int firstitem=0;
		int lastitem=arr.length-1;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr2[i]%2==0)
			{
				arr2[firstitem]=arr[i];
				firstitem++;

			}
			else
			{
				arr2[lastitem]=arr[i];
				lastitem--;
			}
		}
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr[i] +" ");
		}
	}

}
