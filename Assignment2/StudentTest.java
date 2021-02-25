/**
 * 
 * @author sadhanaindukuri
 * @version 1.0
 * @since 02-24-2021
 * 
 * <h1>StudentTest Class</h1>
 * This is a class that tests whether the student class I coded works correctly.
 * 
 *  <h2>Compile Instructions</h2>
 *  Compile by running the following command: {@code javac StudentTest.java}
 *  
 *  <h2>Execute Instructions</h2>
 *  Execute by running the following command: {@code java StudentTest}
 *
 */
public class StudentTest {
	
	/**
	 * This is the main method of the StudentTest class. This is where I check to see whether my Student class is working
	 * correctly. I do this by creating an instance of the student class and course class. I then call on the printSchedule()
	 * method to see if I made the appropriate call when creating an instance of the course class.
	 * @param args is the command line arguments
	 */
	public static void main(String[] args)
	{
		Student test = new Student("John","Smith",20,3.6f,"Computer Science","School of Computer Science");
		Student.Course innerTest = test.new Course();
		innerTest.printSchedule();
	}
	
}
