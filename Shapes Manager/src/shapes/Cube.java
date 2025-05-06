package shapes;

public class Cube extends Shape{
	double length,breath,height;
	
	public Cube() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cube(String shapeType, String shapeID) {
		super(shapeType, shapeID);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void getInput() {
		
		getShapeID();
		System.out.println("enter length:");
		length=in.nextDouble();
		System.out.println("enter breath:");
		breath=in.nextDouble();
		System.out.println("enter height:");
		height=in.nextDouble();
		CalculateArea();
	}
	@Override
	public void CalculateArea() {
	 SurfaceArea=2*(length*breath+breath*height+length*height);
	//System.out.println(SurfaceArea);
	}
	@Override
	public String toCSVString() {
		String out=String.format("%s,%s,%f,%f,%f,%f",shapeType,shapeID,SurfaceArea,length,breath,height);
		return out;
	}
	@Override
	public String toString() {
		String out=String.format("%-10s %-10s %10.2f length:%-10.2f breath:%-10.2f height:%-10.2f",shapeType,shapeID,SurfaceArea,length,breath,height);
		return out;
	}
	
		
	
}


	