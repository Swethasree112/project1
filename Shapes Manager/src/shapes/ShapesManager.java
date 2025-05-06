package shapes;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;

public class ShapesManager {
      public enum shapeType{Square,Rectangle,Circle,Cube};
      String shapesFileName="C:\\Users\\sweth\\Downloads\\addon\\Shapes Manager\\src\\shapes\\shape.txt";
      ArrayList<Shape> shapes =new ArrayList<>();
      

      
      public boolean AddShape(shapeType type) {
    	  Shape s= null;
    	  switch(type) {
		  case Square:
			s=new Square();
			
			break;
		case Rectangle:
			s=new Rectangle();
			break;
		case Cube:
			s=new Cube();
			break;
		case Circle:
			s=new Circle();
			break;

		}
    	  s.getInput();
    	  //System.out.println(s.toCSVString());
    	 // s.deserialize(s.toCSVString());
    	  AddShape2File(s);
    	   shapes.add(s);
    	  // System.out.println(shapes);
    	  s = null;
    	  return true;
    	  
      }

	private void AddShape2File(Shape s) {
    	  FileWriter f=null;
    	  try {
	      f=new FileWriter(shapesFileName,true);
    	  BufferedWriter bw= new BufferedWriter(f);
   		  bw.write(s.toCSVString());
   		  bw.newLine();
   		  bw.close();
   		  f.close();
    	 
    	  }
    	  catch(Exception e) {
    	  e.printStackTrace();
      }finally{
    	  f=null;
      }
	}
	public void ListShapes() {
		System.out.println("List of shapes");
		/*
		for(Shape s:shapes) {
			System.out.println(s.toString());*/
		try {
			BufferedReader reader=new BufferedReader(new FileReader(shapesFileName));
			String line=reader.readLine();
			System.out.println("List of Shapes from file");
			while(line!=null) {
			System.out.println(line);
			} 
			reader.close();
		}catch (IOException e) {
			System.out.println("error reading file:"+e.getMessage());
		}
		}
	
	 public void deleteShape() {
		    Scanner in= new Scanner(System.in);
		    System.out.println("Enter the Shape ID to delete:");
		    String shapeIDToDelete = in.nextLine();

		    // Find the shape by its ID
		    Shape shapeToDelete = null;
		    for (Shape s : shapes) {
		        if (s.shapeID.equals(shapeIDToDelete)) {
		            shapeToDelete = s;
		            break;
		        }
		    }

		    if (shapeToDelete != null) {
		        shapes.remove(shapeToDelete); // Remove shape from the list
		        System.out.println("Shape with ID " + shapeIDToDelete + " has been deleted.");
		    } else {
		        System.out.println("No shape found with the given ID.");
		    }

		    // After deletion, rewrite the file with the updated shapes list
		    rewriteShapesToFile();
		}

		private void rewriteShapesToFile() {
		    try {
		        FileWriter f = new FileWriter(shapesFileName);
		        BufferedWriter bw = new BufferedWriter(f);

		        for (Shape s : shapes) {
		            bw.write(s.toCSVString());
		            bw.newLine();
		        }

		        bw.close();
		        f.close();
		    } catch (IOException e) {
		        System.out.println("Error writing to file: " + e.getMessage());
		    }
		}

}

