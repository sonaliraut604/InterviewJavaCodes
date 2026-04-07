package Infosys;

public class RemoveDulicateFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Learn java Learn selenium Learn api selenium";
		
		String [] str=name.split(" ");
		
		int count;
		
		for(int i=0;i<str.length;i++)
		{
		   count=1;
		   
		   for(int j=i+1;j<str.length;j++)
		   {
			   if(str[i].equals(str[j]))
			   {
				   count++;
				   
				   str[j]="0";
			   }
		   }
		   
		   if(count>1 && str[i]!="0")
		   {
			   System.out.println(str[i]);
		   }
			
		}
		
		
	}

}
