package NewPractiseCode;

import java.util.HashMap;

public class OccuranceOfEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="sonali raut";
		
		char[] ch=name.toCharArray();
		
		HashMap<Character,Integer>map=new HashMap<Character,Integer>();
		
		for(char chew:ch)
		{
			if(!map.containsKey(map))
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
