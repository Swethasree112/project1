package basicsto_intermediate;

import java.util.Scanner;

public class q10_productofOddIntegers {
	/**
	 * This program calculates and prints the product of odd numbers from 1 to 15.
		(Odd numbers: 1, 3, 5, 7, ..., 15)
		
		Problem Flow:
		Start from 1 to 15
		Increment by 2 to get odd numbers
		Multiply all odd numbers
		Print the final product
		
		Input / Output Example:
		Output:
		Product of odd numbers from 1 to 15 = 2027025
		(Odd numbers: 1 × 3 × 5 × 7 × 9 × 11 × 13 × 15 = 2027025)

	 */
	
	    public static void main(String[] args) {
	    	        //step 1: Initialize product as 1 (since we're multiplying)
	    	        int product = 1;
	    	        
	    	        //step 2: Start with a StringBuilder to build the multiplication sequence
	    	        StringBuilder sequence = new StringBuilder();
	    	        
	    	        //step 3: Loop through odd numbers from 1 to 15 (increment by 2)
	    	        for (int i = 1; i <= 15; i += 2) {
	    	            product *= i; // Multiply current odd number to the product
	    	            
	    	        //step 4: Append the current odd number to the sequence
	    	            if (i > 1) {
	    	                sequence.append(" × "); // Add multiplication sign for subsequent numbers
	    	            }
	    	            sequence.append(i); // Add the current odd number to the sequence
	    	        }
	    	        //step 5:display the product
	    	        System.out.println("Product of odd numbers from 1 to 15 =" + product);
	    	        //step 6:Print the multiplication sequence and the final product
	    	        System.out.println("Odd numbers: " + sequence.toString() + " = " + product);
	    	    }
	    	}

