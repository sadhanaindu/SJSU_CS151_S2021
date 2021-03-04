/**
 * 
 * @author sadhanaindukuri
 * @version 1.0
 * @since 03-3-2021
 * 
 * <h1>Customer Class</h1>
 * This is a class that represents a Customer at Target. This class extends Person. 
 * A customer is also a person. So, any instance of Customer 
 * also has the attributes: first and last name, address, id, and ssn.
 * 
 */
public class Customer extends Person {
	
	/**
	 * private primitive int attribute
	 */
	private int customerID;
	
	/**
	 * private String attribute
	 */
	private String payPreference;
	
	/**
	 * Creates a customer with no parameters. Creates an instance of the Customer class. 
	 */
	public Customer()
	{
		super();
		this.setID(0);
		this.setPayPreference("");
	}
	
	
	/**
	 * Creates a customer with the given parameters. Creates an instance of the Customer class.
	 * @param firstName is the first name of the customer shopping at Target
	 * @param lastName is the last name of the customer shopping at Target
	 * @param address is the address of the customer shopping at Target
	 * @param id is the id number of the customer shopping at Target
	 * @param ssn is the social security number of the customer shopping at Target
	 */
	public Customer(String firstName, String lastName, Address address, int id, String ssn)
	{
		super(firstName, lastName, address,ssn);
		this.customerID = id;
		this.payPreference = "";
	}

	/**
	 * getter method for the identification number of the customer. 
	 * @return a primative int that is the identification number of the customer. It can be between 1-9 digits.
	 */
	public int getID() {
		return customerID;
	}

	/**
	 * setter method for the identification number of the customer. 
	 * @param customerID is the identification number of the customer. It can be between 1-9 digits.
	 */
	public void setID(int customerID) {
		this.customerID = customerID;
	}

	/**
	 * getter method for the payment preference of the customer. 
	 * @return a string that is a representation of the customer's payment preference
	 */
	public String getPayPreference() {
		return payPreference;
	}

	/**
	 * setter method for the payment preference of the customer. 
	 * @param customerID is the payment preference of the customer. 
	 */
	public void setPayPreference(String payPreference) {
		this.payPreference = payPreference;
	}
	
	
	/**
	 * method that displays the preferred method of payment for the customer to command line screen. 
	 */
	public void makePayment()
	{
		System.out.println("The customer's preferred payment method is: " + getPayPreference());
	}
	
	/**
	 * a method that introduces the customer. 
	 * This prints out not only the attributes of a customer, but also the attributes of a person. This includes:
	 * first and last name, ID, address. It will not display SSN. 
	 */
	public void introduce()
	{
		String value = toString();
		int startIndex = value.indexOf("\nSSN");
		int endIndex = value.indexOf("\nID");
		String noSSN = value.substring(0,startIndex);
		noSSN+= value.substring(endIndex);
		System.out.println(noSSN);
	}
	
	/**
	 * method that gives a string representation of the customer. This method overrides the toString method from the Person class.
	 * This representation includes their first and last name, 
	 * age, social security number, address, customer ID, and their payment preference. 
	 */
	@Override
	public String toString()
	{
		String value = super.toString();
		value += "\nID: " + customerID + "\nPayment Preference: " + payPreference + "\nThis person is a customer";
		return value;
		
	}

}
