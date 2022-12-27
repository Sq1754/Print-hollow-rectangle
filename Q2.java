import java.util.Scanner;

public class Q2 {
	public static void main(String[]args) {
		
		// Q2  : print hollow rectangle
		/*
		    *********
		    *       *
		    *       *
		    *********
		*/
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Set values for Rows and Columns:");
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		
		// outer loop
		for(int i=1;i<=rows;i++) {
			for(int j = 1; j<=columns;j++) {
				// cell->(i,j)  visualize this as matrices
				if(i==1||j==1||i==rows||j==columns) {
					System.out.print("*");
				}
				else {System.out.print(" ");}
			}
			System.out.println();
		}
		
	}
}
