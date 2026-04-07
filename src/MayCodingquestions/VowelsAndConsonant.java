package MayCodingquestions;

public class VowelsAndConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name="sonali amar rautiii";
		
		int Ccount=0;
		int Vvowels=0;
		
		
		for(int i=0;i<name.length();i++)
		{
			
		if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o' ||name.charAt(i)=='u')
		{
			Vvowels++;
		}
		else if(name.charAt(i)>='a' && name.charAt(i)<'z')
		{
			Ccount++;
		}
		
		}
		
		System.out.println(Vvowels);
		System.out.println(Ccount);
	}

}
