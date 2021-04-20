import java.util.ArrayList;

public class Shapes {
	
	private static ArrayList<Shape> shapeList;
	
	public Shapes(ArrayList<Shape> shapeList)
	{
		this.shapeList = shapeList;
	}

	public ArrayList<Shape> getShapeList() {
		return shapeList;
	}

	public void setShapeList(ArrayList<Shape> shapeList) {
		this.shapeList = shapeList;
	}
	
	synchronized public static void compute()
	{	
		for(Shape s: shapeList)
		{
			System.out.println(s.toString());
		}
	}
	
	public Shape max() {
		double area = 0;
		Shape max = new Circle(0);
		for(Shape s: shapeList)
		{
			double temp = s.computeArea();
			if (temp > area)
			{
				area = temp;
				max = s;
			}
		}
		
		return max;
	}
	
	public Shape min() {
		double area = 2147483647;
		Shape min = new Circle(0);
		for(Shape s: shapeList)
		{
			double temp = s.computeArea();
			if (temp < area)
			{
				area = temp;
				min = s;
			}
		}
		
		return min;
	}

}
