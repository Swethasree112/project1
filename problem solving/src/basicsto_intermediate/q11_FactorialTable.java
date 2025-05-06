package basicsto_intermediate;

import java.util.Scanner;

public class q11_FactorialTable {

	
		/**
		 * This program reads a number n from the user and prints the 
		 factorial of numbers from 1 to n in a table format.
		 
		 Problem Flow:
		Read n from user
		Start fact = 1
		Loop from 1 to n
		Multiply fact *= i
		Print each number with its factorial
		
		Sample Output:
		Input:
		Enter the N value: 5

		Output:
		N   |   Factorial
		--------------------
	  	1  |            1
	  	2  |            2
	  	3  |            6
	  	4  |           24
	  	5  |          120
		 */
	            public static void main(String[] args) {
		        // step 1:Create a scanner object to read input from user
		        Scanner scanner = new Scanner(System.in);

		        //step 2: get user inputs
		        System.out.print("Enter the N value: ");
		        int n = scanner.nextInt();
		        
		        //step 3: Print the table header
		        System.out.println("N   |   Factorial");
		        System.out.println("--------------------");

		        //step 4: use for Loop from 1 to n and calculate factorial for each number
		        for (int i = 1; i <= n; i++) {
		            long fact = 1; // Initialize factorial variable for each iteration
		        //step 5: Calculate the factorial for the current value of i
		            for (int j = 1; j <= i; j++) {
		                fact *= j;
		            }
		        //step 6: Print the current number and factorial
		            System.out.printf("%2d  |%12d\n", i, fact);
		        }

		        //step 7: Close the scanner
		        scanner.close();
}

}
