package MayCodingquestions;

import java.util.HashSet;

public class ThreeArraynumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9,10,1,3};
		int c[] = {11,12,13,14,1,3};
		
		
		HashSet set2=new HashSet();
		HashSet set3=new HashSet();
		
		
		for(int num:b)
		{
			set2.add(num);
		}
		
		for(int num:c)
		{
			set3.add(num);
		}
		
		
		for(int num:a)
		{
			if(set2.contains(num) && set3.contains(num))
			{
				System.out.println(num);
			}
		}

	}

}
