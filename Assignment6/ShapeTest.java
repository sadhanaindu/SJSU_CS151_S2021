import java.util.ArrayList;

public class ShapeTest {
	
	public static void main(String[] args)
	{
		Circle c1 = new Circle(2);
		Hexagon h1 = new Hexagon(2);
		Rectangle r1 = new Rectangle(2,4);
		Triangle t1 = new Triangle(2,6);
		
		Circle c2 = new Circle(4);
		Hexagon h2 = new Hexagon(4);
		Rectangle r2 = new Rectangle(4,8);
		Triangle t2 = new Triangle(4,12);
		
		ArrayList<Shape> shapeList = new ArrayList<Shape>();
		shapeList.add(c1);
		shapeList.add(h1);
		shapeList.add(r1);
		shapeList.add(t1);
		shapeList.add(c2);
		shapeList.add(h2);
		shapeList.add(r2);
		shapeList.add(t2);
		Shapes s = new Shapes(shapeList);
		
		System.out.println("\nExcersise 2: ----------------------------------------------");
		System.out.println("\nSmallest and largest area in this list of shapes:\n");
		System.out.println("The largest area --> " + s.max().toString());
		System.out.println("The smallest area --> "+ s.min().toString());
		
		System.out.println("\nExcersise 1: MultiThreading -------------------------------");
		
		ShapeExecutor se1 = new ShapeExecutor("1",s);
		ShapeExecutor se2 = new ShapeExecutor("2",s);
		
		se1.start();
		se2.start();
		
		try {
			se1.join();
			se2.join();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
	}

}
