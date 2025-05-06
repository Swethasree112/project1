package basicsto_intermediate;

import java.util.Scanner;

public class q13_SmallestOfNumber {
	/**
	 * This program first reads how many numbers the user wants to enter 
	 (N). Then it reads those N numbers and finds the smallest among 
	 them.
	 
	 Problem Flow:
	Get total number of inputs N
	Read first number as smallest
	Loop remaining N-1 times
	Compare each number with smallest
	Update smallest if a smaller number is found
	Print final smallest number
	
	Sample Input / Output:
	Input:
	Enter how many numbers you want to input: 5
	Enter number 1: 22
	Enter number 2: 18
	Enter number 3: 31
	Enter number 4: 6
	Enter number 5: 27
	Output:
	The smallest number is: 6
	*/
	        public static void main(String[] args) {
	        //step 1:Create a scanner object to read input from the user
	        Scanner scanner = new Scanner(System.in);
	        
	        //step 2:Ask the user for how many numbers they want to input
	        System.out.print("Enter how many numbers you want to input: ");
	        int N = scanner.nextInt();
	        
	        //step 3: Read the first number as the initial smallest number
	        System.out.print("Enter number 1: ");
	        int smallest = scanner.nextInt();
	        
	        //step 4: Loop to read remaining N-1 numbers and compare them
	        for (int i = 2; i <= N; i++) {
	            System.out.print("Enter number " + i + ": ");
	            int num = scanner.nextInt();
	            
	       //step 5: Update smallest if a smaller number is found
	            if (num < smallest) {
	                smallest = num;
	            }
	        }
	        //step 6: Print the smallest number
	        System.out.println("The smallest number is: " + smallest);
	        
	        //step 7: Close the scanner
	        scanner.close();
	    }
	}
