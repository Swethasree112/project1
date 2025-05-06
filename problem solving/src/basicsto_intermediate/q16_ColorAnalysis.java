package basicsto_intermediate;

import java.util.Scanner;

public class q16_ColorAnalysis {
		// TODO Auto-generated method stub
		/**
		 *  This program uses a switch statement to examine the value of a 
		 char-type variable called colour and prints one of the following
		 messages, depending on the character assigned:
			RED if either r or R is assigned to colour.
			GREEN if either g or G is assigned to colour.
			BLUE if either b or B is assigned to colour.
			BLACK if any other character is assigned to colour.
			
			Problem Flow:
			Prompt the user to enter a single character for the color code.
			Use a switch statement to check the character and assign the corresponding color.
			Print the entered color code and the corresponding color name.

			Sample Input / Output:
			Input:
			Enter Color code character: g
			Output:
			Color Code g is GREEN

		 */
		    public static void main(String[] args) {
		        //step 1: Create a scanner class to get input from user
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter Color code character: ");
		        //step 2: Read the first character entered
		        char colour = scanner.next().charAt(0);
		        //step 3: Use a switch to determine the color
		        String colorName;
		        switch (colour) {
		            case 'r':
		                colorName = "RED";
		                break;
		            case 'g':
		                colorName = "GREEN";
		                break;
		            case 'b':
		                colorName = "BLUE";
		                break;
		            default:
		                colorName = "BLACK";
		                break;
		        }

		        //step 4: Print the color code and corresponding color name
		        System.out.println("Color Code " + colour + " is " + colorName);

		        //step 5: Close the scanner
		        scanner.close();
		    }

}
