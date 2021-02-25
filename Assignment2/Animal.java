/**
 * 
 * @author sadhanaindukuri
 * @version 1.0
 * @since 02-24-2021
 * 
 * <h1>Animal Class</h1>
 * This is a class that represents an animal that is not extinct.
 */
public class Animal {
	/**
	 * private String attribute
	 */
	private String type;
	/**
	 * private String attribute
	 */
	private String name;
	/**
	 * private primitive int attribute
	 */
	private int age;
	/**
	 * private String attribute
	 */
	private String gender;
	/**
	 * private String attribute
	 */
	private String enviroment;
	/**
	 * private primitive double attribute
	 */
	private double speed;
	
	/**
	 * Creates an animal with the given parameters. Creates an instance of the animal class.
	 * @param type is the type of animal that is created. For example, it can be a dog, cat, etc. 
	 * @param name is the name of the animal. 
	 * @param age is the age of the animal in years. 
	 * @param gender is the gender of the animal.
	 * @param enviroment is the place where the animal lives.
	 * @param speed is how fast the animal moves. This is given in miles per hour
	 */
	public Animal(String type, String name, int age, String gender, String enviroment, double speed)
	{
		setType(type);
		setName(name);
		setAge(age);
		setGender(gender);
		setEnviroment(enviroment);
		setSpeed(speed);
	}

	/**
	 * getter method for the type of animal
	 * @return a string that is the type of animal. It can be a dog or a cat, for example. 
	 */
	public String getType() {
		return type;
	}

	/**
	 * setter method for the type of animal
	 * @param type is the type of animal. It can be a dog or a cat, for example.
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * getter method for the name of the animal
	 * @return a string that is the name of the animal
	 */
	public String getName() {
		return name;
	}

	/**
	 * setter method for the name of the animal
	 * @param name is the name of the animal
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * getter method for the age of the animal
	 * @return a primitive int that is the age of the animal in years
	 */
	public int getAge() {
		return age;
	}

	/**
	 * setter method for the age of the animal
	 * @param age is the age of the animal in years
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * getter method for the gender of the animal
	 * @return a string that is the gender of the animal
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * setter method for the gender of the animal
	 * @param gender is the gender of the animal
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * getter method for the place where the animal lives.
	 * @return a string that is the place where the animal lives.
	 */
	public String getEnviroment() {
		return enviroment;
	}

	/**
	 * setter method for the place where the animal lives.
	 * @param enviroment is the place where the animal lives.
	 */
	public void setEnviroment(String enviroment) {
		this.enviroment = enviroment;
	}

	/**
	 * getter method for how fast the animal moves.
	 * @return a double that is how fast the animal moves in miles per hour
	 */
	public double getSpeed() {
		return speed;
	}

	/**
	 * setter method for how fast the animal moves.
	 * @param speed is how fast the animal moves in miles per hour
	 */
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	/**
	 * method that gives a string representation of the animal. This representation includes its name, gender, type 
	 * age, environment, and speed.
	 */
	@Override
	public String toString()
	{
		return getName() + ", the " + getGender()+ " " + getType() + ", is " 
			+ getAge() + " years old, lives in the " + getEnviroment() 
			+ ", and moves at a speed of " + getSpeed() + " miles per hour!";
	}
	
	/**
	 * method that prints out to the command line that the animal moves
	 */
	public void move()
	{
		System.out.println("moved");
	}
	
	/**
	 * method that prints out to the command line that the animal makes a sound
	 */
	public void sound()
	{
		System.out.println("made a sound");
	}
	
	/**
	 * method that prints out to the command line that the animal eats
	 */
	public void eat()
	{
		System.out.println("ate");
	}
	
	/**
	 * method that prints out to the command line that the animal sleeps
	 */
	public void sleep()
	{
		System.out.println("slept");
	}
	
	
	
}
