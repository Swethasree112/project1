package basicsto_intermediate;

import java.util.Scanner;

public class q03_compundinterest {

	
		/**
		 * This program calculates Compound Interest using the formula:
	 		F = P × (1 + i)ⁿ
	 		Where:
				P = Principal amount
				i = Rate/100
				n = Number of years
	 			Here, F is the final amount (principal + interest)
		
			 Problem Flow:
			Input P, R, and N from user
			Calculate i = R / 100
			Use formula F = P × (1 + i)^N
			Display the final compound amount
			
			Input / Output Example:
			Input:
			Enter Principal Value: 10000  
			Enter Rate of Interest: 10  
			Enter No. of Years: 2
			Output:
			Compound Interest 12100.00
		 */
	       public static void main(String[] args) {
	       //Step 1:Variable declaration P=principle amount;R=rate of interest;i=interest;n=number of years,F=final compound amount
		   double P,R,i,n,F;
		   //Step2:Get the user inputs using scanner class
		   Scanner in=new Scanner(System.in);
		   System.out.println("Enter Principle Value:");
		   P=in.nextDouble();
		   System.out.println("Enter Rate of Interest");
		   R=in.nextDouble();
		   System.out.println("Enter No. of Years:");
		   n=in.nextDouble();
		   
		   //step 3:Calculate interest using formula interest=rate/100
		   i = R / 100;
		   //step 4:Calculate final compound interest using formula F = P × (1 + i)^N
		   F = P*Math.pow(i+1,n);
		   
		   //step 5:Display the compound interest
		   System.out.printf("Compound Interest %.2f\n", F);
	}

}
