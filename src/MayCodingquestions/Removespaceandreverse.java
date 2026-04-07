package MayCodingquestions;

public class Removespaceandreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name="sonali raut amar";
		
		String rev="";
		
		name=name.replaceAll("\\s", "");
		System.out.println(name);
		
		
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
	}

}
