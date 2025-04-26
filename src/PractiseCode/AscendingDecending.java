package PractiseCode;

import java.util.ArrayList;
import java.util.Collections;

public class AscendingDecending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer>aslist=new ArrayList<Integer>();
		
		aslist.add(10);
		aslist.add(1);
		aslist.add(6);
		aslist.add(8);
		aslist.add(9);
		
		System.out.println("default:"+ aslist );
		
		Collections.sort(aslist);
		System.out.println("ascending"+ aslist);
		
		Collections.sort(aslist,Collections.reverseOrder());
		
		System.out.println("Decending"+aslist);
		
	}

}
