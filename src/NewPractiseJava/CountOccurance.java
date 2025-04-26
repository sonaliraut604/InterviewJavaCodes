package NewPractiseJava;

public class CountOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name="sonali raut ammarrrrr";
		
		int actual=name.length();
		int expected=name.replaceAll("r", "").length();
		
		int count=actual-expected;
		
		System.out.println(count);
	}

}
