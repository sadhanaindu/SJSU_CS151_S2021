/**
 * 
 * @author sadhanaindukuri
 * @version 1.0
 * @since 03-3-2021
 * 
 * <h1>Address Class</h1>
 * This is a class that represents an address of a person that works at Target.
 * 
 */
public class Address {
	/**
	 * private int attribute
	 */
	private int streetNum;
	/**
	 * private String attribute
	 */
	private String streetName;
	/**
	 * private String attribute
	 */
	private String city;
	/**
	 * private String attribute
	 */
	private String zip;
	/**
	 * private String attribute
	 */
	private String state;
	
	/**
	 * Creates an address with the given parameters. Creates an instance of the Address class.
	 * @param streetNum is the number of the street the person lives on
	 * @param streetName is the name of the street that the person lives on
	 * @param city is the city that the person lives in
	 * @param zip is the zip code where the person resides
	 * @param state is the state the person lives in within the United States
	 */
	
	public Address()
	{
		
	}
	
	public Address(int streetNum, String streetName, String city, String zip, String state)
	{
		this.setStreetNum(streetNum);
		this.setStreetName(streetName);
		this.setCity(city);
		this.setZip(zip);
		this.setState(state);
		
	}
	
	/**
	 * getter method for getting the street number that the person resides in
	 * @return a string that represents the number of the street the person lives on
	 */
	public int getStreetNum() {
		return streetNum;
	}

	/**
	 * setter method for street number that the person resides in
	 * @param streetNum is the number of the street the person lives in
	 */
	public void setStreetNum(int streetNum) {
		this.streetNum = streetNum;
	}

	/**
	 * getter method for getting the street name that the person resides in
	 * @return a string that represents the name of the street the person lives in
	 */
	public String getStreetName() {
		return streetName;
	}

	/**
	 * setter method for street name that the person resides in
	 * @param streetName is the name of the street the person lives in
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	/**
	 * getter method for getting the city that the person resides in
	 * @return a string that represents the city the person lives in
	 */
	public String getCity() {
		return city;
	}

	/**
	 * setter method for city that the person resides in
	 * @param city is the city the person lives in
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * getter method for getting the zip code that the person resides in
	 * @return a string that represents the zip code the person lives in
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * setter method for zip code that the person resides in
	 * @param city is the zip code the person lives in
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

	/**
	 * getter method for getting the state that the person resides in
	 * @return a string that represents the state the person lives in
	 */
	public String getState() {
		return state;
	}

	/**
	 * setter method for state that the person resides in
	 * @param city is the state the person lives in
	 */
	public void setState(String state) {
		this.state = state;
	}
	
	/**
	 * method that gives a string representation of the address. This representation includes its street number, street name, city,
	 * zip code, and state.
	 */
	public String toString()
	{
		String value = streetNum + " " + streetName + ", " 
					+ city + " " + state + " " + zip;
		return value;
	}

}
