package Infosys;

import java.util.jar.Attributes.Name;

public class aaCountTheWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "my name is umesh";
        int count=1;
        
	
		for(int i=0;i<s.length();i++)
		{
		  if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
		  { 
			  count++;
		  }
		}
		System.out.println(count);
	}

}
