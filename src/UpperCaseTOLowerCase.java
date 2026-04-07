
public class UpperCaseTOLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name="sONALIamARRAut";
		
		String result="";
		
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			
			if(Character.isLowerCase(ch))
			{
				result=result+Character.toUpperCase(ch);
			}
			else
			{
				result=result+Character.toLowerCase(ch);
			}
				
		}
		System.out.println(result);
	}

}
