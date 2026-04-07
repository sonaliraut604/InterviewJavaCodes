package MayCodingquestions;

import java.util.jar.Attributes.Name;

public class DuplicateFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		String name="sllllllll";
		
		String dup="";
		
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			
			if(name.indexOf(ch)==name.lastIndexOf(ch))
			{
				dup=dup+ch;
			}
		}
		System.out.println(dup);		
	}
}
