import java.util.Scanner;

public class CountTheWord {

	public static void main(String[] args) {
		
		
	String name="sonali amar raut name is njjjyh";
	int count=1;
	
	for(int i=0;i<name.length();i++)
	{
		if(name.charAt(i)==' ' && name.charAt(i+1)!=' ')
		{
			count++;
		}
	}
	System.out.println(count);
	
	}

}
