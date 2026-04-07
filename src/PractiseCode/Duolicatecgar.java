package PractiseCode;

import java.util.HashSet;

public class Duolicatecgar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="sonaliilrautjkm";
		
		HashSet set=new HashSet();
		
		
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			
			if(name.indexOf(ch)!=name.lastIndexOf(ch)&& !set.contains(ch))
			{
				set.add(ch);
				System.out.println(ch);
			}
		}
		
	}

}
