import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateWordandReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] name= {"sonali","amar","raut","sonali","swati","kkkk"};
	
		Set<String> set=new TreeSet<String>();
	
		for(String word:name)
		{
			String rev="";
			
			for(int i=word.length()-1;i>=0;i--)
			{
				rev=rev+word.charAt(i);
				
			}
			
			set.add(rev);
		}

		System.out.println(set);
		
		
		
		
		
		
		
	}

}
