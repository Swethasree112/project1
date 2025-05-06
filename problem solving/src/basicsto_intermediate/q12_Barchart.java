package basicsto_intermediate;

import java.util.Scanner;

public class q12_Barchart {


		/**
		 * This program reads 5 numbers (each between 1 and 30) from the user.
		 For each number, it prints a line with that many asterisks *, 
		 forming a simple bar chart or histogram.
		 
		 Problem Flow:
		Read 5 numbers from the user
		Loop through each number
		For each number:
		Print the number
		Print that many * using inner loop
		
		Sample Output:
		Input:
		Enter 5 Numbers in a same line: 
		3 7 2 6 1
		Output:
		3 ***
	 	7 *******
	 	2 **
	 	6 ******
	 	1 *
	 	
		 */
	            public static void main(String[] args) {
		        //step 1: Create a scanner object to read input from the user
		        Scanner scanner = new Scanner(System.in);

		        //step 2: Prompt the user to enter 5 numbers
		        System.out.print("Enter 5 Numbers in a same line: ");
		        
		        //step 3:Read the 5 numbers from the user in a single line
		        int[] numbers = new int[5];
		        for(int i = 0; i < 5; i++) {
		            numbers[i] = scanner.nextInt(); // Read each number into the array
		        }
		        //step 4:Loop through each number and print the bar chart line
		        for(int i = 0; i < 5; i++) {
		        //step 5: Print the number
		        System.out.print(numbers[i] + " ");
		            
		        //step 6: Print that many asterisks
		        for(int j = 0; j < numbers[i]; j++) {
		                System.out.print("*");
		            }
		       //step 7: Move to the next line after printing the asterisks
		           System.out.println();
		        }
		        //step 8: Close the scanner
		        scanner.close();
		    }
		}