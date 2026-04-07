import java.util.HashMap;

public class EachcharacterOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="ROBOT";
		
		char[] ch=name.toCharArray();
		
		
		HashMap<Character,Integer>map=new HashMap<Character,Integer>();
		
		for(char val:ch)
		{
			if(!map.containsKey(val))
			{
				map.put(val, 1);
			}
			else
			{
				int count=map.get(val);
				map.put(val, count+1);
			}
		}
		
		System.out.println(map);
		
		for(Character key:map.keySet())
		{
			if(map.get(key)>1)
			{
			System.out.println(key+"="+map.get(key));
			}
		}
		
		
		
	}

}
