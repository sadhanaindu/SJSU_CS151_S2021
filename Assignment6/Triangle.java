
public class Triangle extends Shape {

	private int base;
	private int height;
	
	public Triangle(int base, int height)
	{
		this.setBase(base);
		this.setHeight(height);
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	synchronized public double computeArea() {
		double area = 0.5*getBase()*getHeight();
		return area;
	}

	@Override
	public String toString() {
		String area = "Triange Area (with base " + getBase() + " and height " + getHeight() + ") : " + computeArea();
		return area;
	}

}
