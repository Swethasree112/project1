package basicsto_intermediate;

import java.util.Scanner;

public class q17_IceWaterStream {
	/**
	 *  This program checks the temperature value (temp) and determines 
	 the physical state of water:
		If temp < 0 → "ICE"
		If temp is between 0 and 100 (inclusive) → "WATER"
		If temp > 100 → "STEAM"
		
		Flow Summary:
		Get user input for temperature
		Use if-else to decide the state of water
		Display the result to the user
		
		Sample I/O:
		Input:
		Enter the water temperature: 120
		Output:
		Water status is STEAM for the Temperature 120.00

	 */
	public static void main(String[] args) {
		        //step 1:Create a Scanner class to get the input from the user
		        Scanner scanner = new Scanner(System.in);

		        //step 2:Prompt the user to enter the temperature
		        System.out.print("Enter the water temperature: ");
		        double temp = scanner.nextDouble();

		        //step 3: use if else to determine water state
		        String state;
		        if (temp < 0) {
		            state = "ICE";
		        } else if (temp <= 100) {
		            state = "WATER";
		        } else {
		            state = "STEAM";
		        }

		        //step 4: Display the result
		        System.out.printf("Water status is %s for the Temperature %.2f\n", state, temp);

		        //step 5: Close the scanner
		        scanner.close();


	}

}
