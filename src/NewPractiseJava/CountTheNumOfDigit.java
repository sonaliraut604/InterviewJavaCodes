package NewPractiseJava;

public class CountTheNumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=1234567899;
		int count=0;
		
		while(a>0)
		{
			a=a/10;
			count++;
		}
		System.out.println(count);
	}

}
