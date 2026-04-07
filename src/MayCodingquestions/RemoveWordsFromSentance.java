package MayCodingquestions;

public class RemoveWordsFromSentance {

	public static void main(String[] args) {
		

		String name="Learn java Learn selenium Learn api selenium";
		
		name=name.toLowerCase();
		
		int count;
		
		String[] arr=name.split(" ");
//		System.out.println(arr);
		
		System.out.println("duplicate words in a string: ");
		
		for(int i=0;i<arr.length;i++)
		{
			count=1;
			
			for(int j=i+1;j<arr.length;j++)
			{
					if(arr[i].equals(arr[j]))
				{
					count++;  //2 3
					arr[j]="0";  
				}
				
			}
			if(count>1 && arr[i]!="0")
			{
				System.out.println(arr[i]);
			}
		
					
			
		
	

		}
	}
}
