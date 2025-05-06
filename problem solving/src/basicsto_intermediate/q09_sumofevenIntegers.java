package basicsto_intermediate;

public class q09_sumofevenIntegers {

	
		
		/**
		 * This program finds the sum of even numbers between 2 and 30 (inclusive).
		 * 
		 * Problem Flow:
		 * Start loop from 2 to 30
		 * Check if number is even (i % 2 == 0)
		 * Add to sum
		 * Print final sum
		 * 
		 * Input / Output Example:
		 * Output:
		 * Sum of even numbers from 2 to 30 = 240
		 * (Even numbers: 2 + 4 + 6 + ... + 30 = 240)
		 */
	            public static void main(String[] args) {
	            //step 1:Declare the variable sum
		        int sum = 0;
		        StringBuilder sequence = new StringBuilder();

		        //step 2:Use for loop ,start loop from 2 to 30,increment the values
		        for (int i = 2; i <= 30; i++) {
		        //step 3:Check if number is even
		        if (i % 2 == 0) {
		                sum += i;
		                sequence.append(i);
		                if (i < 30) {
		                    sequence.append(" + ");// Add + sign for subsequent numbers
		                }
		            }
		        }
		        
		        //step 4:Print final sum
		        System.out.println("Sum of even numbers from 2 to 30 = " + sum);
		        //step 5:To print the even number in sequence
		        System.out.println("(Even numbers: " + sequence.toString() + " = " + sum + ")");
		    }
		}

