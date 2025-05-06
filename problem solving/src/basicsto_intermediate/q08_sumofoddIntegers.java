package basicsto_intermediate;

import java.util.Scanner;

public class q08_sumofoddIntegers {

	
		/**
		 * This program calculates the sum of the first n odd integers 
		 (Example: 1 + 3 + 5 + ... + (2n - 1)).
		 
		 Problem Flow:
		Input n from user
		Loop from 1 to (2n−1) in steps of 2
		Accumulate the sum
		Print the result
		
		Input / Output Example:
		Input:
		Enter how many odd numbers to sum: 5
		Output:
		Sum of first 5 odd numbers is 25
		(1 + 3 + 5 + 7 + 9 = 25)
*/              public static void main(String[] args) {
	            //Step 1:scanner class to get input from user 
		        Scanner in = new Scanner(System.in);
		        //Step 2: Input n from user
		        System.out.print("Enter how many odd numbers to sum: ");
		        int n = in.nextInt();

		        //Step 3:sum variable declaration
		        int sum = 0;
		        //Step 4:string sequence creation
		        StringBuilder sequence = new StringBuilder();
		        //Step 5:Loop from 1 to (2n−1) for odd numbers
		        for (int i = 1; i <= (2 * n - 1); i += 2) {
		            sum += i;
		            sequence.append(i);
		            if (i < (2 * n - 1)) {
		                sequence.append(" + ");// Add + sign for subsequent numbers
		            }
		        }

		        // Step 6:Print the result
		        System.out.println("Sum of first " + n + " odd numbers is " + sum);
		        //Step 7:Print sum values as sequence
		        System.out.println("(" + sequence.toString() + " = " + sum + ")");
                //Step 8:close scanner
		        in.close();
		    }
}


