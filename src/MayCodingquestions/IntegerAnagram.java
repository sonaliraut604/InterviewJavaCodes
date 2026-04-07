package MayCodingquestions;

public class IntegerAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int num=370;
		
	int value=num;
	
	int sum=0;
	
	while(num>0)
	{
		int r=num%10;
		System.out.println(r);
		
		num=num/10;
		
		sum=sum+r*r*r;
	}
	
	if(value==sum)
	{
		System.out.println("Interger are anagram");
	}
	else
	{
		System.out.println("Interger are not anagram");
	}
		
	}

}
