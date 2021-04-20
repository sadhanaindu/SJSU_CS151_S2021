
public class Rectangle extends Shape{

	private int width;
	private int height;
	
	public Rectangle(int width, int height)
	{
		this.setWidth(width);
		this.setHeight(height);
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	synchronized public double computeArea() {
		double area = getWidth()*getHeight();
		return area;
	}

	@Override
	public String toString() {
		String area = "Rectangle Area (with width " + getWidth() + " and height " + getHeight() + "): " + computeArea();
		return area;
	}

}
