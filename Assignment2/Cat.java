/**
 * 
 * @author sadhanaindukuri
 * @version 1.0
 * @since 02-24-2021
 * 
 * <h1>Cat Class</h1>
 * This is a class that represents a cat that is alive. This class extends the class Animal. A cat is an animal.
 */
public class Cat extends Animal implements Domesticated,Scratcher {

	/**
	 * Creates a dog with the given parameters. Creates an instance of the Dog class.
	 * @param name is the name of the cat
	 * @param age is the age of the cat in years
	 * @param gender is the gender of the cat
	 * @param enviroment is where the cat lives
	 * @param speed is how fast the cat moves in miles per hour
	 */
	public Cat(String name, int age, String gender, String enviroment, double speed) {
		super("Cat", name, age, gender, enviroment, speed);
	}

	/**
	 * method that prints out to the command line that the cat scratches
	 */
	public void scratch() {
		System.out.println("scratched");
		
	}

	/**
	 * method that prints out to the command line that the cat walks
	 */
	public void walk() {
		System.out.println("walked");
		
	}

	/**
	 * method that prints out to the command line that the cat greets humans
	 */
	public void greetHuman() {
		System.out.println("greeted human");
		
	}

}
