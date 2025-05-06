package basicsto_intermediate;

import java.util.Scanner;

public class q15_HeatAnalysis {
	/**
	 *  This program uses a switch statement to examine the value of 
	 an integer called flag. Based on its value, it prints one of the
	 following messages:
		HOT if the flag has the value 1.
		LUKE WARM if the flag has the value 2.
		COLD if the flag has the value 3.
		OUT OF RANGE if the flag has any other value.
		
	 Problem Flow:
	Prompt the user to input an integer value for the flag.
	Use a switch statement to check the value of the flag and assign the correct heat status.
	Print the flag value and its corresponding heat status.
	
	Sample Input / Output:
	Input:
	Enter Heat code (1-3): 2

	Output:
	Flag 2 is LUKE WARM


	 */
	
	    public static void main(String[] args) {
	        //step 1:Create a scanner object to read input from the user
	        Scanner scanner = new Scanner(System.in);

	        //step 2:Prompt the user to input an integer value for the flag
	        System.out.print("Enter Heat code (1-3): ");
	        int flag = scanner.nextInt();

	        //step 3:Use switch statement to check the value of the flag and assign the correct heat status
	        String status;
	        switch (flag) {
	            case 1:
	                status = "HOT";
	                break;
	            case 2:
	                status = "LUKE WARM";
	                break;
	            case 3:
	                status = "COLD";
	                break;
	            default:
	                status = "OUT OF RANGE";
	                break;
	        }

	        //step 4: Print the flag value and its corresponding heat status
	        System.out.println("Flag " + flag + " is " + status);

	        //step 5:Close the scanner
	        scanner.close();
	    }
	}
