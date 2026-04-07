package Infosys;

import java.util.HashMap;

public class CharacterOfeachOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="sonali raut amar";
		
		HashMap<Character,Integer>map=new HashMap<Character,Integer>();
		
		char[] ch=name.toCharArray();
		
		for(char word:ch)
		{
			if(!map.containsKey(ch))
			{
				map.put(word, 1);
			}
			else
			{
				int count=map.get(ch);
				map.put(word, count+1);
			}
		}
		System.out.println(map);
		
		
		
		
	}

}
