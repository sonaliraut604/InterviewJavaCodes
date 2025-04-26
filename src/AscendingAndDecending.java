import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AscendingAndDecending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer>aslist=new ArrayList<Integer>();
		
		aslist.add(3);
		aslist.add(6);
		aslist.add(10);
		aslist.add(1);
		aslist.add(0);
		
		System.out.println("default list:"+aslist);
		
		Collections.sort(aslist);
		
		System.out.println("Ascending order"+aslist);
		
		Collections.sort(aslist,Collections.reverseOrder());
		
		System.out.println("Decending order"+aslist);
		
		
	}

}
