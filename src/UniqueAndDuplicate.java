import java.util.HashMap;
import java.util.HashSet;

public class UniqueAndDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="nnnnnnkmmppuu";
		
		
		HashSet map=new HashSet();
		
		
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			if(name.indexOf(ch)!=name.lastIndexOf(ch) && !map.contains(ch))
			{
				System.out.print(ch+" ");
				map.add(ch);
			
			}	
	}
	}
	
}
		
	

