package MayCodingquestions;

public class CharacterOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="sonali rauttt";
		
		int actual=name.length();
		
		int expected=name.replaceAll("t", "").length();
		System.out.println(actual-expected);
		
	}

}
