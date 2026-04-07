
public class Smallest_Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sen="automation is best testingjjjj";
		
		String[] str=sen.split(" ");
		
		String name=str[0];
		
		for(String val:str)
		{
			if(val.length()< name.length())
			{
				name=val;
			}
			
		}
		System.out.println(name);
	}

}
