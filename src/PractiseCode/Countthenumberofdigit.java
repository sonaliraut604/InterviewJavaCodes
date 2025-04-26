package PractiseCode;

public class Countthenumberofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num=123456;
		
		int count=0;
		
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);
	}

}
