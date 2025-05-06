package basicsto_intermediate;

import java.util.Scanner;

public class q19_CumulativeProduct {

	/**
	 * This program reads a set of numbers from the user and calculates 
	 the cumulative product, which means multiplying all the numbers 
	 together one by one.
	 
	 Code Flow 
	Get number count n
	Use for loop to input numbers
	Multiply each number with product
	Print final result
	
	Test Data
	Input:
	6.2, 12.3, 5.0, 18.8, 7.1, 12.8
	Output:
	Cumulative Total = 514537.165312


	 */
	
	    public static void main(String[] args) {
	    	//step 1:get user input
	        Scanner scanner = new Scanner(System.in);

	        //step 2: Get number count from user
	        System.out.print("Enter the number of values: ");
	        int n = scanner.nextInt();

	        double product = 1.0;

	        //step 3: Input and multiply numbers
	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter number " + (i + 1) + ": ");
	            double num = scanner.nextDouble();
	            product *= num;
	        }

	        //step 4:Display result
	        System.out.println("Cumulative Total = " + product);
            //step 5:close the scanner object
	        scanner.close();



	}

}
