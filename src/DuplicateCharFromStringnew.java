import java.util.HashMap;

public class DuplicateCharFromStringnew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	 String name="sonaliiRautatt";
	 
	 char[] ch=name.toCharArray(); 
	 
	 HashMap<Character,Integer>map=new HashMap<Character,Integer>();
	 
	 for(char words:ch)
	 {
		  if(!map.containsKey(words))
		  {
			  map.put(words, 1);
		  }
		  
		  else
		  {
			  int count=map.get(words);
			  map.put(words, count+1);
		  }
	 }
	 System.out.println(map);
	 
	 
	 for(Character word:map.keySet())
	 {
		 if(map.get(word)>1)
		 {
		 System.out.println(word+"="+map.get(word));
		 }
	 }
	 
	 
	
	
		
	 }
		}
	
	
	
