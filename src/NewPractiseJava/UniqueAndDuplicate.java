package NewPractiseJava;

public class UniqueAndDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String word="ssssssooppk";
		String uni="";
		
		for(int i=0;i<word.length();i++)
		{
			char ch=word.charAt(i);
			
			if(word.indexOf(ch)==word.lastIndexOf(ch))
			{
				uni=uni+ch;
			}
		}
		System.out.println(uni);
		
		
		//duplicate
		
		String duplicate="";
		for(int i=0;i<word.length();i++)
		{
			char ch=word.charAt(i);
			
			if(word.indexOf(ch)!=word.lastIndexOf(ch))
			{
				duplicate=duplicate+ch;
			}
		}
		System.out.println(duplicate);
	}

}
