import java.util.Scanner;

public class MatrixCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a=new int[3][4];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++) 
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("print the matrix:");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++) 
			{
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println();
		}
		
		
		
	}

}
