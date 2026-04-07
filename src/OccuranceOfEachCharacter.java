import java.util.HashMap;

public class OccuranceOfEachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="mmmmjjjkkl";
		
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		
		char[] ch=name.toCharArray();
	
		
		for(char chnew:ch)
		{
			if(!map.containsKey(chnew))
			{
				map.put(chnew, 1);
			}
			else
			{
				int count=map.get(chnew);
				map.put(chnew,count+1 );
						
			}
		}
		System.out.println(map);
		
		for(Character key:map.keySet())
		{
			if(map.get(key)>1)
			{
			System.out.print(key+"-"+map.get(key));
			}
		}
	}

}
