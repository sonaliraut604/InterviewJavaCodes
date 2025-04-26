package NewPractiseCode;

public class uniqueandDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name="programming";
		
		String uni="";
		
		for(int i=0;i<name.length();i++)
	   {
			char ch=name.charAt(i);
			
			if(name.indexOf(ch)!=name.lastIndexOf(ch))
			{
				uni=uni+ch;
			}
			
	   }
		System.out.println(uni);
		
		
	}
}
