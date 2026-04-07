package MayCodingquestions;

public class CountWor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="sonali raut amar seagvg bhrfu";
		
		int count=1;
		
		for(int i=0;i<name.length();i++)
		{
			  char ch=name.charAt(i);
			  
			  if(name.charAt(i)==' ' && name.charAt(i+1)!=' ')
			  {
				  count++;
			  }
		}
		System.out.println(count);
	}

}
