package PractiseCode;

public class VowelsAndConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Sonali Raut";
		
		int Ccount=0;
		int Vcount=0;
		
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u')
			{
				Vcount++;
				
			}
			
			if(name.charAt(i)>='A' && name.charAt(i)<'z')
			{
				Ccount++;
			}
		
		}
		System.out.println(Vcount);
	     System.out.println(Ccount);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
