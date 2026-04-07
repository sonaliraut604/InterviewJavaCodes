package Infosys;

public class Characteroccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name="sonali raut amar";
		
		int actual=name.length();
		
		int expected=name.replaceAll("a", "").length();
		
		int total=actual-expected;
		
		System.out.println(total);
	}

}
