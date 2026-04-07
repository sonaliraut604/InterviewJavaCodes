import java.util.HashSet;

public class Removeintegerandremoveduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String val="af76hjmkhy875cgnpagn";
		
		val=val.replaceAll("[0-9]", "");
		System.out.println(val);
		
		HashSet set=new HashSet();
		
		for(int i=0;i<val.length();i++)
		{
			char ch=val.charAt(i);
			
			if(val.indexOf(ch)!=val.lastIndexOf(ch))
			{
               set.add(ch);
			}
			
		}
		 System.out.println(set);
		
	}

}
