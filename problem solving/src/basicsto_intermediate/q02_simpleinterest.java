package basicsto_intermediate;

import java.util.Scanner;

public class q02_simpleinterest {
	/**
	 * Write a Java program to calculate Simple Interest using the formula:
 		SI = (P × N × R) / 100
 		Where:
		P = Principal amount
		N = Number of years
		R = Rate of interest
		
		Problem Flow:
		User inputs:
			Principal (P)
			Rate (R)
			Years (N)
		Program calculates:
			SI = (P × N × R) / 100
		Output displays the Simple Interest value.
		
		Input / Output Example:
		Input:
		Enter Principal Amount: 10000  
		Enter Rate of Interest: 5  
		Enter No. of Years: 2
		Output:
		Simple Interest = 1000.00
	 */

	public static void main(String[] args) {
		       //step 1:variable declaration ,P for Principal amount,N for Number of year,R for rate of interest,SI to calculate simple interest/
		       int P,N,R,SI; 
		       //Step 2:get user inputs
	      	   Scanner in=new Scanner(System.in); 
			   System.out.println("Enter Principal Amount:");
			    P=in.nextInt();
			   System.out.println("Enter Rate of Interest:");
			    N=in.nextInt();
			   System.out.println("Enter No. of Years:");
			    R=in.nextInt();
			    //Step 3:Calculate Simple interest using formula SI= (P*N*R) / 100; 
			    SI= (P*N*R) / 100;
			    //Step 4:Display the results
			   System.out.println("Simple Interest ="+ SI);
			 
	}
}
