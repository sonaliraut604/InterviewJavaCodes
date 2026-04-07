package MayCodingquestions;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="sonali%^&*()))&^%$#@Raut";
		
		name=name.replaceAll("[a-zA-Z0-9]", "");
		
		System.out.println(name);
		
		String name1="gbbhhjjnn%^&())**&^^%%$";
		
		name1=name1.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(name1);
		
	}

}
