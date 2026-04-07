package MayCodingquestions;

public class CountTheNumberofDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=123456789;
		int count=0;
		
		while(num>0)
		{
	
			num=num/10;
			System.out.println(num);
			count++;
			
		}
		System.out.println(count);
}
}