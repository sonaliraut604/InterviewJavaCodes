package Infosys;

import java.util.HashMap;

public class DuplicateCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
  String name="sonaliiRauta";
  
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
  
  
  for(Character val:map.keySet())
  {
	if(map.get(val)>1)
	{
    System.out.println(val+"-"+map.get(val));
	}
  }
}
}