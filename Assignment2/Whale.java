/**
 * 
 * @author sadhanaindukuri
 * @version 1.0
 * @since 02-24-2021
 * 
 * <h1>Whale Class</h1>
 * This is a class that represents a whale that is alive. This class extends the class Animal. A whale is an animal.
 */
public class Whale extends Animal implements Swimmer{

	/**
	 * Creates a raccoon with the given parameters. Creates an instance of the Raccoon class.
	 * @param name is the name of the whale
	 * @param age is the age of the whale in years
	 * @param gender is the gender of the whale
	 * @param enviroment is where the whale lives
	 * @param speed is how fast the whale moves in miles per hour
	 */
	public Whale(String name, int age, String gender, String enviroment, double speed) {
		super("Whale", name, age, gender, enviroment, speed);
	}

	/**
	 * method that prints out to the command line that the whale swims
	 */
	public void swim() {
		System.out.println("swam");
		
	}
	
	

}
