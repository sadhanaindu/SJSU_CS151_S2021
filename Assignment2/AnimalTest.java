/**
 * 
 * @author sadhanaindukuri
 * @version 1.0
 * @since 02-24-2021
 * 
 * <h1>AnimalTest Class</h1>
 * This is a class that tests whether the Animal, Cat, Dog, Raccoon, and Whale classes 
 * as well as the Domesticated, Scratcher, and Swimmer interfaces I coded work correctly.
 * 
 *  <h2>Compile Instructions</h2>
 *  Compile by running the following command: {@code javac AnimalTest.java}
 *  
 *  <h2>Execute Instructions</h2>
 *  Execute by running the following command: {@code java AnimalTest}
 *
 */
public class AnimalTest {
	
	/**
	 * This is the main method of the AnimalTest class. This is where I check to see whether my Animal, 
	 * Cat, Dog, Raccoon, and Whale classes as well as the Domesticated, Scratcher, and Swimmer interfaces
	 * are working correctly. I do this by creating instances of each animal classes. I then call each one 
	 * of the possible functionalities on each of the instances. 
	 * @param args is the command line arguments
	 */
	public static void main(String[] args)
	{
		Dog bubba = new Dog("Bubba", 1, "male", "home", 5.0);
		Cat tom = new Cat("Tom", 2, "female", "home", 5.0);
		Raccoon rocky = new Raccoon("Rocky", 5, "non-binary", "forest", 3.0);
		Whale destiny = new Whale("Destiny", 13, "female", "ocean", 20.0);
		
		System.out.println(bubba.toString());
		System.out.println("This is what " + bubba.getName() + " did today:");
		bubba.move();
		bubba.sound();
		bubba.eat();
		bubba.sleep();
		bubba.walk();
		bubba.greetHuman();
		bubba.bark();
		
		System.out.println();
		
		System.out.println(tom.toString());
		System.out.println("This is what " + tom.getName() + " did today:");
		tom.move();
		tom.sound();
		tom.eat();
		tom.sleep();
		tom.walk();
		tom.greetHuman();
		tom.scratch();
		
		System.out.println();
		
		System.out.println(rocky.toString());
		System.out.println("This is what " + rocky.getName() + " did today:");
		rocky.move();
		rocky.sound();
		rocky.eat();
		rocky.sleep();
		rocky.scratch();
		
		System.out.println();
		
		System.out.println(destiny.toString());
		System.out.println("This is what " + destiny.getName() + " did today:");
		destiny.move();
		destiny.sound();
		destiny.eat();
		destiny.sleep();
		destiny.swim();
		
	}

}
