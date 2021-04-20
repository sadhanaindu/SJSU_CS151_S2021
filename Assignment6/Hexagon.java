
public class Hexagon extends Shape {

	private int side;
	
	public Hexagon(int side)
	{
		this.setSide(side);
	}
	
	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
	
	@Override
	synchronized public double computeArea() {
		double constant = 3 * Math.sqrt(3) / 2 ;
		double area = constant * getSide();
		return area;
	}

	@Override
	public String toString() {
		String area = "Hexagon Area (with side length " + getSide() + "): " + computeArea();
		return area;
	}

}
