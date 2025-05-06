package basicsto_intermediate;

import java.util.Scanner;

public class q01_areaofcircle {
	public static void main(String[] args) {
		//step 1:Variable declaration
		/**
		 * declare variable r-radius,area
		 **/
		
        double r, area;
       //step 2:input from user
        /**
         * use the scanner class to get the input from user
         **/
        Scanner in = new Scanner(System.in); 
        System.out.print("Enter Radius of Circle: ");
        r = in.nextDouble();
        //step 3:Calculation
        /**
         * Calculate area using formula (22.0 / 7) * r * r
         */
        area = (22.0 / 7) * r * r; 
        //step 4:Display the output
        System.out.printf("Area of Circle with Radius  %.4f is %.4f",r,area);

}

}

