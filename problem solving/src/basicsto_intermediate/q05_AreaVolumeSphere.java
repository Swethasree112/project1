package basicsto_intermediate;

import java.util.Scanner;

public class q05_AreaVolumeSphere {


		/**
		 *  This program calculates the Volume and Surface Area of a sphere 
		 *  using the following formulas:
				Volume (V) = (4/3) × π × r³
				Area (A) = 4 × π × r²
		
		Problem Flow:
		Get r (radius) from user
		Calculate area using A = 4πr²
		Calculate volume using V = (4/3)πr³
		Display both values
		
		 Input / Output Example:
		Input:
		Enter Radius of Sphere: 7
		Output:
		Volume of Sphere: 1436.571429
		Area of Sphere  : 615.428571
		
		 */
	public static void main(String[] args) {
		//step 1:Declare the variables
		double A,V,r;
		//step 2:Scanner class to get the inputs from user
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Radius of Sphere:");
		r=in.nextDouble();
		//step 3:Calculate the volume of sphere
		V =(4.0/3.0)*Math.PI*Math.pow(r,3);
		//step 4:Calculate the area of sphere
		A =4*Math.PI*Math.pow(r, 2);
		//step 5:Print the results for volume and sphere with 6 decimal places
		System.out.printf("Volume of Sphere: %.6f\n",V);
		System.out.printf("Area of Sphere  :%.6f\n",A);
	
	}

}
