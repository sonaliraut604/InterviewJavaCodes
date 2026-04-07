package Infosys;

public class CountTheNumberOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=1223334445;
		int count=1;
		
		while(num>1)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);
	}

}
