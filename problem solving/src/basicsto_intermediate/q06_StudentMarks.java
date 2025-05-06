package basicsto_intermediate;

import java.util.Scanner;

public class q06_StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * This program allows the user to enter 3 test marks of a student, 
		 calculates the total and average, and displays the result.
		 
		Problem Flow:
		Get 3 marks from user
		Add marks → total
		Divide total by 3.0 → average
		Display total and average
		
		Input / Output Example:
		Input:
		Enter Mark 1: 80  
		Enter Mark 2: 75  
		Enter Mark 3: 85  
		Output:
		Total Marks   = 240  
		Average Marks = 80.0
		 */
		int m1,m2,m3,total;
		double average;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Mark 1:");
		m1=in.nextInt();
		System.out.println("Enter Mark 2:");
		m2=in.nextInt();
		System.out.println("Enter Mark 3:");
		m3=in.nextInt();
		total=m1+m2+m3;
		System.out.printf("Total Marks     ="+total);
		average=(m1+m2+m3)/3.0;
		System.out.printf("\nAverage Marks   ="+average);
		
	}

}
