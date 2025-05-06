package shapes;

public class Square extends Shape{
	double side;
	public Square() {
		shapeType="Square";
	}
	
	public Square(String shapeType, String shapeID) {
		super(shapeType, shapeID);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getInput() {
		// TODO Auto-generated method stub
		getShapeID();
		System.out.println("Enter size length:");
		side=in.nextDouble();
		CalculateArea();
	}
	@Override
	public void CalculateArea() {
		//Calculate Area
		SurfaceArea = side*side;
		//System.out.println(SurfaceArea);
	}
	@Override
	public String toCSVString() {
		
		String out=String.format("%s,%s,%f,%f",shapeType,shapeID,SurfaceArea,side);
		return out;
	}
	@Override
	public void deserialize(String csv) {
		super.deserialize(csv);
		String tokan[]=csv.split(",");
		side=Double.parseDouble(tokan[3]);
		tokan=null;
	}
	@Override
	public String toString() {
		String out=String.format("%-10s %-10s %10.2f side:%-10.2f" ,shapeType,shapeID,SurfaceArea,side);
		return out;
	}
	}


