
public class CharacterOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="sonali raut aamar";
		
		int count=name.length();
		
		int total=name.replaceAll("r", "").length();
		
		int totalcount=count-total;
		
		System.out.println(totalcount);
	}

}
