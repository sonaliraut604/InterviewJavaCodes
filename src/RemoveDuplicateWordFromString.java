import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicateWordFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name="sonali raut sonali learn raut learn";
		
	    String[] word=name.split(" ");
		 
		 
		 HashSet set=new HashSet();
		 
		 for(String ddd:word)
		 {
			set.add(ddd);
			 
		 }
		 
		 System.out.println(set);
	
		 
//		 int count;
//		 
//		 for(int i=0;i<word.length;i++)
//		 {
//			 count=1;
//			 
//			 for(int j=i+1;j<word.length;j++)
//			 {
//				 if(word[i].equals(word[j]))
//				 {
//					 count++;
//					 word[j]="0";
//					 
//				 }
//			 }
//			 
//			 if(count>1 && word[i]!="0")
//			 {
//				 System.out.println(word[i]);
//			 }
//		 }
//		
		
		
		
	}

}
