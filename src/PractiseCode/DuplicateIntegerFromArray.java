package PractiseCode;

public class DuplicateIntegerFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] name= {"sonali","nikita","raut","sonali"};
		
		for(int i=0;i<name.length;i++)
		{
			for(int j=i+1;j<name.length;j++)
			{
				if(name[i]==name[j])
				{
					System.out.println(name[i]);
				}
			}
		}
		
		
	}

}
