
public class ReverseWordWithout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name="sonali amar raut";
		
		String [] word=name.split(" ");
		
		for(int i=word.length-1;i>=0;i--)
		{
			System.out.print(word[i].toUpperCase()+ " ");
	
		}
	}

}
