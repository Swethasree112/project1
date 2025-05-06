package shapes;

public class Rectangle extends Shape{
	double length,width;
	public Rectangle() {
		shapeType="Rectangle";
	}
	
	public Rectangle(String shapeType, String shapeID) {
		super(shapeType, shapeID);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getInput() {
		// TODO Auto-generated method stub
		getShapeID();
		System.out.println("enter length:");
		length=in.nextDouble();
		System.out.println("enter width:");
		width=in.nextDouble();
        CalculateArea();
	}

	@Override
	public void CalculateArea() {
	SurfaceArea=length*width;
		
	}

	@Override
	public String toCSVString() {
		String out=String.format("%s,%s,%f,%f,%f",shapeType,shapeID,SurfaceArea,length,width);
		return out;
	}

	@Override
	public String toString() {
		String out=String.format("%-10s %-10s %10.2f length:%-10.2f width:%-10.2f",shapeType,shapeID,SurfaceArea,length,width);
		return out;
	}

	 
}