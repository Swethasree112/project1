package shapes;

import java.util.Scanner;

import shapes.ShapesManager.shapeType;

public class Menu {
	Scanner in=new Scanner(System.in);
    ShapesManager sn=new ShapesManager();
	private void displayHeader() {
		System.out.println("SHAPES MANAGER PROJECT");
	}
	private void displayShapesMenu(){
		int sel = 0;         //sel means selection 
		while(sel != 9) {
			displayHeader();
			System.out.println("Shapes Menu");
			System.out.println();
			System.out.println("1.Square");
			System.out.println("2.Rectangle");
			System.out.println("3.Cube");
			System.out.println("4.Circle");
			System.out.println("9.Exit");
			System.out.println("Enter your choice");
			sel=in.nextInt();
			
			
		switch (sel) {
		case 1: 
			//Add  Square
			sn.AddShape(shapeType.Square);
			break;
        case 2: 
        	//Add rectangle
        	sn.AddShape(shapeType.Rectangle);
			break;
        case 3: 
        	//Add Cube
        	sn.AddShape(shapeType.Cube);
	         break;
        case 4: 
	   //Add circle
        	sn.AddShape(shapeType.Circle);
	        break;
         case 9: 
	//Exit
	         break;
       default:
			System.out.println("invalid selection .Try again!!");
		  break;
		}
		}
	}
	public void displayMainMenu(){
		int sel = 0;   //sel = selection 
		while(sel != 9) {
			displayHeader();
			System.out.println("Main Menu");
			System.out.println();
			System.out.println("1.Add shape");
			System.out.println("2.delete shape");
			System.out.println("3.list shapes");
			System.out.println("9.Exit");
			System.out.println("Enter your choice");
			sel=in.nextInt();
			
			
		switch (sel) {
		case 1: 
			//Add  Shape
			displayShapesMenu();
			break;
        case 2: 
        //delete shapes
        	sn. deleteShape();
			break;
        case 3: 
        	//list shapes
         sn.ListShapes();
	         break;
         case 9: 
	       //Exit
	         break;
	         default:
			System.out.println("invalid selection .Try again!!");
		  break;
		}
		}
	}
}
