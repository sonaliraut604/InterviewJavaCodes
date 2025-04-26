import java.util.HashMap;

public class OccuranceOfEachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="sonaliraut";
		
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
	}

}
