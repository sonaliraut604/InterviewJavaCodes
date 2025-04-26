package PractiseCode;

import java.util.HashMap;

public class OccuranceOfEacgCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name="sonaliii";
		
		char[] ch=name.toCharArray();
		
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(char chew:ch)
		{
			if(!map.containsKey(chew))
			{
				map.put(chew, 1);
			}
			else
			{
				int count=map.get(chew);
				map.put(chew, count+1);
			}
		}
		System.out.println(map);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
