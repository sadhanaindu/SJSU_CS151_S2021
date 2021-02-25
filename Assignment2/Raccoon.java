/**
 * 
 * @author sadhanaindukuri
 * @version 1.0
 * @since 02-24-2021
 * 
 * <h1>Raccoon Class</h1>
 * This is a class that represents a raccoon that is alive. This class extends the class Animal. A raccoon is an animal.
 */
public class Raccoon extends Animal implements Scratcher{

	/**
	 * Creates a raccoon with the given parameters. Creates an instance of the Raccoon class.
	 * @param name is the name of the raccoon
	 * @param age is the age of the raccoon in years
	 * @param gender is the gender of the raccoon
	 * @param enviroment is where the raccoon lives
	 * @param speed is how fast the raccoon moves in miles per hour
	 */
	public Raccoon(String name, int age, String gender, String enviroment, double speed) {
		super("Raccoon", name, age, gender, enviroment, speed);
	}

	/**
	 * method that prints out to the command line that the raccoon scratches
	 */
	public void scratch() {
		System.out.println("scratched");
		
	}

}
