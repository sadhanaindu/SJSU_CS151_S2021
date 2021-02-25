/**
 * 
 * @author sadhanaindukuri
 * @version 1.0
 * @since 02-24-2021
 * 
 * <h1>Product Class</h1>
 * This is an immutable class that represents a product created. Instances of this class, any products created, cannot 
 * be modified.
 */
public final class Product 
{
	/**
	 * private String attribute that is final
	 */
	private final String name;
	/**
	 * private String attribute that is final
	 */
	private final String description;
	/**
	 * private primitive double attribute that is final
	 */
	private final double price;
	/**
	 * private primitive int attribute that is final
	 */
	private final int maxQuantityToOrder;
	
	/**
	 * creates a product with the given parameters. Creates instance of the product class.
	 * @param name is the name of the product created
	 * @param description is the aspects of the product created
	 * @param price is the price of the product in dollars
	 * @param maxQuantityToOrder is maximum quantity of the product that is allowed to be ordered
	 */
	public Product(String name, String description, double price, int maxQuantityToOrder)
	{
		this.name = name;
		this.description = description;
		this.price = price;
		this.maxQuantityToOrder = maxQuantityToOrder;
	}
	
	/**
	 * getter method that gets the name of the product created
	 * @return a string that is the name of the product created
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * getter method that gets the aspects of the product created
	 * @return a string that describes the aspects of the product created
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * getter method that gets the price of the product created
	 * @return a double that is the price of the product created in dollars
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * getter method that gets the maximum quantity of the product that is allowed to be ordered
	 * @return a primitive int that is the maximum quantity of the product that is allowed to be ordered
	 */
	public int getMaxQuantityToOrder() {
		return maxQuantityToOrder;
	}
	
	/**
	 * method that gives a string representation of the person. This representation includes the name, description, price
	 * and maximum quantity that is allowed to be ordered of the product.
	 */
	@Override
	public String toString()
	{
		return "Name: " + this.name + " Description: " + this.description + " Price: " 
				+ this.price + " Maximum Quantity Allowed To Be Ordered: " + this.maxQuantityToOrder;
	}

}
