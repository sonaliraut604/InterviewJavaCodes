package MayCodingquestions;

public class SumOfAllTheNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        int[] arr = {123, 234, 345, 456};
		 
		        int totalSum = 0;
		        System.out.println("Sum of digits of each element:");
		        for (int num : arr)
		        {
		            totalSum += num;
		            int digitSum = 0;
		            int temp = num;
		            
		            while (temp > 0) {
		                digitSum += temp % 10;
		                temp /= 10;
		            }
		            System.out.println("Number: " + num + " -> Digit Sum: " + digitSum);
		        }
		 
		        System.out.println("Total sum of array: " + totalSum);
		    }
	}


