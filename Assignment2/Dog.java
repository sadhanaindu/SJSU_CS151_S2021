/**
 * 
 * @author sadhanaindukuri
 * @version 1.0
 * @since 02-24-2021
 * 
 * <h1>Dog Class</h1>
 * This is a class that represents a dog that is alive. This class extends the class Animal. A dog is an animal.
 */
public class Dog extends Animal implements Domesticated{

	/**
	 * Creates a dog with the given parameters. Creates an instance of the Dog class.
	 * @param name is the name of the dog
	 * @param age is the age of the dog in years
	 * @param gender is the gender of the dog
	 * @param enviroment is where the dog lives
	 * @param speed is how fast the dog moves in miles per hour
	 */
	public Dog(String name, int age, String gender, String enviroment, double speed) {
		super("Dog", name, age, gender, enviroment, speed);
	}

	/**
	 * method that prints out to the command line that the dog walks
	 */
	public void walk() {
		System.out.println("walked");
	}

	/**
	 * method that prints out to the command line that the dog greets humans
	 */
	public void greetHuman() {
		System.out.println("greeted human");
	}
	
	/**
	 * method that prints out to the command line that the dog barks
	 */
	public void bark(){
		System.out.println("barked");
	}

}
