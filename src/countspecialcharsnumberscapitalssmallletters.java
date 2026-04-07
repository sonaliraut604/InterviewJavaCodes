
public class countspecialcharsnumberscapitalssmallletters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "Hello@2025 *&^%$#QA!";
		
		int special=0;
		int upper=0;
		int lower=0;
		int digit=0;
		
		
		for(int i=0;i<s.length();i++)
		{
		
			char ch=s.charAt(i);
			
			if(Character.isLowerCase(ch))
			{
				lower++;
			}
			else if(Character.isUpperCase(ch))
			{
				upper++;
			}
			else if(Character.isDigit(ch))
			{
				digit++;
			}
			else
			{
				special++;
			}
			
		}
		System.out.println(lower);
		System.out.println(upper);
		System.out.println(digit);
		System.out.println(special);
	}

}
