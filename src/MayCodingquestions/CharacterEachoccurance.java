package MayCodingquestions;

import java.util.HashMap;

public class CharacterEachoccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name="sonai rautaaa";
		
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		
		char[] word=name.toCharArray();
		
		
		for(char ch:word)
		{
			if(!map.containsKey(ch))
			{
				map.put(ch, 1);
			}
			
			else
			{
				int count=map.get(ch);
				map.put(ch, count+1);
			}
		}
		System.out.println(map);
		
		
	}

}
