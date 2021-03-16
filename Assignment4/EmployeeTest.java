/**
 * 
 * @author sadhanaindukuri
 * @version 1.0
 * @since 03-15-2021
 * 
 * <h1>EmployeeTest Class</h1>
 * This is a class that tests whether the Employee class I coded work correctly.
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
	 * This is the main method of the EmployeeTest class. This is where I check to see whether my Employee
	 * classes are working correctly. I do this by creating instances of the Employee class and calling
	 * the computePay method on the instance of the class. 
	 * @param args is the command line arguments
	 */
	public static void main(String[] args)
	{
		Employee john = new Employee("John", "Smith", 101, 35.0d);
		
		System.out.println("40 hours worked: ");
		System.out.println("$" + john.computePay(40));
		
		System.out.println();
		
		System.out.println("23 hours worked: ");
		System.out.println("$" +john.computePay(23));
		
		System.out.println();
		
		System.out.println("1 hour worked: ");
		System.out.println("$" +john.computePay(1));
		
		System.out.println();
		
		System.out.println("0 hours worked: ");
		System.out.println("$" +john.computePay(0));
		
		System.out.println();
		
		System.out.println("-5 hours worked: ");
		System.out.println("$" +john.computePay(-5));
		
		System.out.println();
		
		System.out.println("45 hours worked: ");
		System.out.println("$" +john.computePay(45));
		
		System.out.println();
	}
}
