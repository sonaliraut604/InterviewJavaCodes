package MayCodingquestions;

public class IncreaseCharacterByOneCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="abcd";
		String result="";
		
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			
			char nextint=(char)(ch+1);
			
			result=result+nextint;
		
			
		}
		System.out.println(result);
	}

}
