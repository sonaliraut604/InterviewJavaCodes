
public class Firstandlastdigitindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name="jjjjjjk";
		
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			
		 if(name.indexOf(ch)!=name.lastIndexOf(ch))
		 {
			 System.out.println(ch);
			 
			 System.out.println("first:"+name.indexOf(ch));
			 System.out.println("last"+name.lastIndexOf(ch));
			 break;
		 }
		 
		}
		
		
		
	}

}
