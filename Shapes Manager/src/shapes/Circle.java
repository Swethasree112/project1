package shapes;

public class Circle extends Shape {
	double radius;
 
	public Circle() {
	 shapeType="Circle";
	 
 }
 
	public Circle(String shapeTypes, String shapeID) {
		super(shapeTypes, shapeID);
	
	}

	@Override
	public void getInput() {
		getShapeID();
		System.out.println("Enter radius:");
		radius=in.nextDouble();
	    CalculateArea();
}

	@Override
	public void CalculateArea() {
		// TODO Auto-generated method stub
		SurfaceArea=(22.0/7)*radius*radius;
		
	}

	@Override
	public String toCSVString() {
		String out=String.format("%s,%s,%f,%f",shapeType,shapeID,SurfaceArea,radius);
		return out;
	}

	@Override
	public String toString() {
		String out=String.format("%-10s %-10s %10.2f  radius:%-10.2f",shapeType,shapeID,SurfaceArea,radius);
		return out;
	}
}