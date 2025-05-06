package basicsto_intermediate;

import java.util.Scanner;

public class q14_TextAnalysis {

	
		/**
		 *  This program will read a line of text from the user, analyze 
		 each character, and count how many are letters, digits, whitespace, 
		 or other types of characters (like punctuation).
		 
		 Problem Flow:
		Prompt the user to input a line of text.
		Initialize counters for letters, digits, spaces, and other characters.
		Loop through each character and classify it into one of the categories.
		Display the count for each category: letters, digits, spaces, and others.

		Sample Input / Output:
		Input:
		Enter the text below:
		Hello World! 123

		Output:
		Letters : 10
		Digits : 3
		Space Chars : 2
		Others : 2

		 */
	            public static void main(String[] args) {
		        //step 1:Create a scanner class to get the input from user
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter the text below:");
		        String input = scanner.nextLine(); // Read the entire line of text

		        //step 2:Initialize variables for letters, digits, spaces, and other characters
		        int letterCount=0;
		        int digitCount =0;
		        int spaceCount =0;
		        int otherCount =0;

		        //step 3:Loop through each character in the string
		        for (int i = 0; i < input.length(); i++) {
		            char ch = input.charAt(i); // Get the character at index i

		        //step 4: Classify the character into one of the categories
		            if (Character.isLetter(ch)) {
		                letterCount++; // If it's a letter
		            } else if (Character.isDigit(ch)) {
		                digitCount++; // If it's a digit
		            } else if (Character.isWhitespace(ch)) {
		                spaceCount++; // If it's a space
		            } else {
		                otherCount++; // If it's any other character
		            }
		        }

		        //step 5: Display the count for each category
		        System.out.println("Letters : " + letterCount);
		        System.out.println("Digits : " + digitCount);
		        System.out.println("Space Chars : " + spaceCount);
		        System.out.println("Others : " + otherCount);

		        //step 6: Close the scanner
		        scanner.close();
	}

}
