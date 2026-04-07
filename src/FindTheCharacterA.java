
public class FindTheCharacterA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="sonaliraut";
		
		int count=0;
		
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			
			if(ch=='a'||ch=='A')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
