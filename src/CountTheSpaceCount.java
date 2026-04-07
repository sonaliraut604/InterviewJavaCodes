
public class CountTheSpaceCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="s o n a l i r a u t";
		
    	int count=0;
		
//		char[] ch=name.toCharArray();
//		
//		for(char val:ch)
//		{
//			if(val==' ')
//			{
//				count++;
//			}
//		}
//		
//		System.out.println(count);
//		
		
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			
			if(ch==' ')
			{
				count++;
			}
			
		}
		
		System.out.println(count);
		
}
}


