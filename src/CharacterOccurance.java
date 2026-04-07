
public class CharacterOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="sonali raut aaaamar";
		
		int count=name.length();
		
		int total=name.replaceAll("a", "").length();
		
		int totalcount=count-total;
		
		System.out.println(totalcount);
	}

}
