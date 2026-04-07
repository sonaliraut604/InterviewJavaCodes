
public class ReverseAStringWithoutSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name="so#$onali()^%$#Hj";
		
		String rev="";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			char ch=name.charAt(i);
			
			if(Character.isLetter(ch))
			{
			rev=rev+ch;
			}
		}
		System.out.println("reverse string ="+rev);
		
		int reverseint=0;
		String finalstr="";
		for(int i=0;i<name.length();i++)
		{
			char z=name.charAt(i);
			if(Character.isLetter(z)==false)
			{
				finalstr=finalstr+z;
			}
			
			else
			{
				finalstr=finalstr+rev.charAt(reverseint);
				reverseint=reverseint+1;
			}
		}
		
		System.out.println(finalstr);
		

}
}
