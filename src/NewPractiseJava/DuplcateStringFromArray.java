package NewPractiseJava;

public class DuplcateStringFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] a= {"sonali","nikita","omkar","sonali","amar","swati"};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
		}
	}

}
