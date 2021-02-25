/**
 * 
 * @author sadhanaindukuri
 * @version 1.0
 * @since 02-24-2021
 * 
 * <h1>EmployeeTest Class</h1>
 * This is a class that tests whether the Person and Employee classes I coded work correctly.
 * 
 *  <h2>Compile Instructions</h2>
 *  Compile by running the following command: {@code javac EmployeeTest.java}
 *  
 *  <h2>Execute Instructions</h2>
 *  Execute by running the following command: {@code java EmployeeTest}
 *
 */
public class EmployeeTest {
	
	/**
	 * This is the main method of the EmployeeTest class. This is where I check to see whether my Person and Employee
	 * classes are working correctly. I do this by creating multiple instances of the Employee class and calling
	 * the introduce and calculatePay methods on each instance of the class. 
	 * @param args is the command line arguments
	 */
	public static void main(String[] args)
	{
		Employee joe = new Employee("Joe", "Smith", 20, "234-65-7536", "hill ave", "male", 110.0, 71, "contract", 60.0);
		Employee lisa = new Employee("Lisa", "Gray", 35, "436-75-3846", "green ave", "female", 105.0, 21, "full time", 110000.0);
		Employee timothy = new Employee("Timothy", "Briggs",41,"123-45-6789","poppy ave", "non-binary", 100.0, 910, "full time", 80000.0);
		Employee george = new Employee("George", "Wallace", 15, "643-98-1945", "purple ave", "male", 135.0, 631, "part time", 20.0);
		Employee amy = new Employee("Amy", "Student", 19, "743-98-1246", "green ave", "female", 109.0, 74320, "contract", 45.0);
		
		joe.introduce();
		System.out.println(joe.getFirstName() + " will be payed: $" + joe.calculatePay(30.0) + "\n");
		lisa.introduce();
		System.out.println(lisa.getFirstName() + " will be payed: $" + lisa.calculatePay(2.0) + "\n");
		timothy.introduce();
		System.out.println(timothy.getFirstName() + " will be payed: $" + timothy.calculatePay(4.0) + "\n");
		george.introduce();
		System.out.println(george.getFirstName() + " will be payed: $" + george.calculatePay(25.0) + "\n");
		amy.introduce();
		System.out.println(amy.getFirstName() + " will be payed: $" + amy.calculatePay(45.0) + "\n");
	}

}
