package basicsto_intermediate;

import java.util.Scanner;

public class q04_Fahrenheit2celisius {

	
	/**
	 * This program converts temperature from Fahrenheit to Celsius using the formula:
		C = (5/9) × (F - 32)
		
	Problem Flow:
	Input temperature in Fahrenheit
	Apply formula: C = (5 / 9.0) × (F - 32)
	Display result in Celsius
	
	Input / Output Example:
	Sample Inputs to Test (from question):
	68, 150, 212, 0, -22
	Sample Output (for 68°F):
	68.000000 deg F is 20.000000 deg C
	
	 */
	public static void main(String[] args) {
			//step 1:Declare variables C means celsius F for fahrenheit
		    double C,F;
			//step 2:Get user inputs using scanner class
			Scanner in=new Scanner(System.in);
			System.out.println("Input temperature in Fahrenheit");
			F=in.nextDouble();
			
			//step 3:Calculate the temp from  Fahrenheit to Celsius
			C = (5 / 9.0)*(F-32);
			//step 4:Display the F and C with 6 decimal places using %.6f
			
			System.out.printf("%.6f deg F is %.6f deg C\n", F, C);
			

	}

}
