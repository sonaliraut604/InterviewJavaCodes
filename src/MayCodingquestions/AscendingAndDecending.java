package MayCodingquestions;

import java.util.ArrayList;
import java.util.Collections;

public class AscendingAndDecending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> value=new ArrayList<Integer>();
		
		value.add(100);
		value.add(50);
		value.add(80);
		value.add(70);
		value.add(10);
		value.add(20);
		
//		System.out.println(value);
		
		Collections.sort(value);
		System.out.println("ascending order "+ value);
		
		Collections.sort(value,Collections.reverseOrder());
		System.out.println("descending order "+value);
		
	}

}
