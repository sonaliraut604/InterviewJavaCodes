package NewPractiseCode;

import java.util.ArrayList;
import java.util.Collections;

public class AscendingAndDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer>count=new ArrayList<Integer>();
		count.add(10);
		count.add(12);
		count.add(8);
		count.add(1);
		count.add(5);
		count.add(6);
		count.add(9);
		
		System.out.println(count);
		
		Collections.sort(count);
		System.out.println("ascending order"+count);
		
		Collections.sort(count,Collections.reverseOrder());
		
		System.out.println("Descending order"+count);
		
		
	}

}
