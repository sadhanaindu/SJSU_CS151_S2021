
public class Circle extends Shape {

	private int radius;
	
	public Circle(int radius)
	{
		this.setRadius(radius);
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	synchronized public double computeArea() {;
		double area = Math.PI * Math.pow(getRadius(),2);
		return area;
	}

	@Override
	public String toString() {
		String area = "Circle Area (with radius " + getRadius() + "): " + computeArea();
		return area;
	}

}
