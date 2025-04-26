
public class Voweslandconsonanat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="sonali amar raut";
		
		int Vcount=0;
		int Ccount=0;
		
		for(int i=0;i<name.length();i++)
		{
			
		if(name.charAt(i)=='a'||name.charAt(i)=='e' ||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u')
		{
			Vcount++;
		}
		else if(name.charAt(i)>='a' && name.charAt(i)<'z')
		{
			Ccount++;
		}
		
	}
		System.out.println(Vcount);
		System.out.println(Ccount);
}
}