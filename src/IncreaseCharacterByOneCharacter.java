
public class IncreaseCharacterByOneCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name="abcd";
		String result="";
		
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			
			char val=(char)(ch+1);
			
			result=result+val;
		}
		
		System.out.println(result);
		
		
	}
}
