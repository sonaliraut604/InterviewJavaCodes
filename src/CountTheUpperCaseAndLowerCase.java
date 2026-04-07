
public class CountTheUpperCaseAndLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="SoNALIAmarRAUT";
		
		int upper=0;
		int lower=0;
		
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			
			
			if(Character.isUpperCase(ch))
			{
				upper++;
			}
			
			else if(Character.isLowerCase(ch))
			{
				lower++;
			}
		}
		System.out.println("upper case count is: "+ upper);
		System.out.println("lower case count is: "+ lower);
		
	}

}
