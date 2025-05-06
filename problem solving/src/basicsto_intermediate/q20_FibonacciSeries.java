package basicsto_intermediate;

import java.util.Scanner;

public class q20_FibonacciSeries {
	/**
	 * This program calculates and displays the first n numbers in the 
	 Fibonacci sequence. Each number is the sum of the previous 
	 two numbers.
	 
	 Code Flow 
	Input: number of terms n
	Initialize first two terms: f1 = 1, f2 = 1
	Loop from i = 3 to n:
		Find next term using f = f1 + f2
		Shift values for next round
	Display all terms
	
	Sample Input/Output
 	Input:
	How many Fibonacci terms? 10
	Output:
	1 1 2 3 5 8 13 21 34 55

	 */

	public static void main(String[] args) {
                //step 1:get user input using scanner class and object
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("How many Fibonacci terms? ");
		        int n = scanner.nextInt();
                //step 2:declare variable f1,f2
		        int f1 = 1, f2 = 1;

		        //step 3: use if else statement
		        if (n <= 0) {
		            System.out.println("Please enter a positive number.");
		        } else if (n == 1) {
		            System.out.println("1");
		        } else {
		            System.out.print(f1 + " " + f2); // Print first two terms

		        //step 4: Generate and print remaining terms
		            for (int i = 3; i <= n; i++) {
		                int f = f1 + f2;
		                System.out.print(" " + f);
		                f1 = f2;
		                f2 = f;
		            }
		         //step 5: Newline after output
		            System.out.println(); 

	}
	}
}
