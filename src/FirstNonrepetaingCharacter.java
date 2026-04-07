
public class FirstNonrepetaingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="kkiinlqooppmm";
		
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			
			if(name.indexOf(ch)==name.lastIndexOf(ch))
			{
				System.out.println(ch);
				
			}
	
	}


}
}