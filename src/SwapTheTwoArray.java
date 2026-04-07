import java.util.Arrays;

public class SwapTheTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {23, 93, 56, 92, 39};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==56)
			{
				arr[i]=39;
			}
			else if(arr[i]==39)
			{
				arr[i]=56;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
