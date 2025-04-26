package PractiseCode;

public class CharacterOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name="sonaliraut";
		
		int main=name.length();
		
		int count=name.replaceAll("a", "").length();
		
		int total=main-count;
		
		System.out.println(total);
	}

}
