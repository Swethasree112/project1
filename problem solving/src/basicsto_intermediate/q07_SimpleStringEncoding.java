package basicsto_intermediate;

import java.util.Scanner;

public class q07_SimpleStringEncoding {

		/**
		 * This program reads a five-letter word from the user and encodes 
		 * it by subtracting 1 from the ASCII value of each character. 
		 * It then prints the newly encoded word.
		 * 
		 * Problem Flow:
		 * Get 5-letter word input
		 * Loop each character → subtract 1 from ASCII
		 * Build new string with changed characters
		 * Print encoded result
		 * 
		 * Input / Output Example:
		 * Input:
		 * Enter a Five letter word: white
		 * Output:
		 * Encoded Word: vghsd
		 */
		    public static void main(String[] args) {
		        // step 1:Get the string
		        String letter;
		        Scanner in = new Scanner(System.in);
		        System.out.println("Enter a Five letter word:");
		        letter = in.nextLine();

		        // step 2:Check if the input is exactly 5 letters
		        if (letter.length() != 5) {
		            System.out.println("Please enter exactly five letters");
		        }

		        //step 3:Encode the word
		        StringBuilder encoded = new StringBuilder();
		        for (int i = 0; i < letter.length(); i++) {
		            char ch = letter.charAt(i);
		            ch = (char) (ch - 1); // Subtract 1 from ASCII value
		            encoded.append(ch);
		        }

		        //step 4:Print the encoded result
		        System.out.println("Encoded Word:" + encoded.toString());

		        //step 5:Close scanner
		        in.close();
		}
		
}
