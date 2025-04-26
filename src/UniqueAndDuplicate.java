
public class UniqueAndDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="nnnnnnk";
		
		String uni="";
		
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i) ;
			if(name.indexOf(ch)!=name.lastIndexOf(ch))
			{
				uni=uni+ch;
			}	
	}
		
		System.out.println(uni);

	}
}