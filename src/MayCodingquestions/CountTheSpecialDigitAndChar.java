package MayCodingquestions;

public class CountTheSpecialDigitAndChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name="sonali@$gmail.com234";
		
		int lettercount=0;
		int digitcount=0;
		int specialcount=0;
		
		
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			
			if(Character.isLetter(ch))
			{
				lettercount++;
			}
			else if(Character.isDigit(ch))
			{
				digitcount++;
			}
			else
			{
				specialcount++;
			}
		}
		
		System.out.println(lettercount);
		System.out.println(digitcount);
		System.out.println(specialcount);
	
	}

}
