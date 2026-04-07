
public class ReverseeachStringandUppercaseit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="sonali amar raut jkio nhgb";
		
		String[] str=name.split(" ");
		
		String reversestring="";
		
		for(String val:str)
		{
			String reverseword="";
			
			if(val.equals("sonali") || val.equals("amar") || val.equals("nhgb"))
			{
			for(int i=val.length()-1;i>=0;i--)
			{
				reverseword=reverseword+val.charAt(i);				
			}
			reverseword=reverseword.substring(0,1).toUpperCase()+reverseword.substring(1).toLowerCase();
			}
			else
			{
				reverseword=val;
			}
			
			reversestring=reversestring+reverseword+" ";
		}
		
		System.out.println(reversestring);
		
		
	}

}
