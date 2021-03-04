
/**
 * @author sadhanaindukuri
 * @version 1.0
 * @since 03-03-2021
 * 
 * <h1>BusinessTest Class</h1>
 * This is a class that tests whether we implemented the UML diagram correctly
 * We create instances of leaf classes and call on certain methods to see if
 * we properly implemented principles of object oriented design like inheritance and method overriding.
 * 
 * <h2>Compile Instructions</h2>
 * Compile by running the following command: {@code javac BusinessTest.java}
 * 
 * <h2>Execute Instructions</h2>
 * Execute by running the following command: {@code java BusinessTest}
 */
public class BusinessTest {
	
	public static void main(String[] args)
	{
		Address consistentAddress = new Address(20875, "Green Dr.", "Cupertino", "95014", "CA");
		
		Executive execOne = new Executive("John", "Brown", consistentAddress, 11111, 100000.0, 500.0,"123-45-6789");
		execOne.setEducationLevel("Undergrad");
		execOne.setDirectDeposit(true);
		execOne.setAge(45);
		execOne.introduce(false);
		System.out.println("Total Pay: $" + execOne.computePay());
		
		System.out.println();
		
		Executive execTwo = new Executive("Sarah", "Green", consistentAddress, 22222, 120000.0, 700.0,"456-16-5432");
		execTwo.setEducationLevel("Undergrad");
		execTwo.setDirectDeposit(false);
		execTwo.setAge(35);
		execTwo.introduce(true);
		System.out.println("Total Pay: $" + execTwo.computePay());
		
		System.out.println();
		
		FullTimeSalaried ftsOne = new FullTimeSalaried("Yara", "Love", consistentAddress, 33333, 75000.0, "365-87-0462");
		ftsOne.setEducationLevel("Undergrad");
		ftsOne.setDirectDeposit(true);
		ftsOne.setAge(25);
		ftsOne.introduce(false);
		System.out.println("Total Pay: $" + ftsOne.computePay(52));
		
		System.out.println();
		
		FullTimeSalaried ftsTwo = new FullTimeSalaried("Steve", "Rodgers", consistentAddress, 44444, 1000.0, "642-67-5926");
		ftsTwo.setEducationLevel("Undergrad");
		ftsTwo.setDirectDeposit(false);
		ftsTwo.setAge(36);
		ftsTwo.introduce(true);
		System.out.println("Total Pay: $" + ftsTwo.computePay(260)); // $1000 /52  * 260 weeks = 5000 dollars
		
		System.out.println();
		
		FullTimeHourly fthOne = new FullTimeHourly("Harry", "Potter",consistentAddress, 55555, 100.0,110.0,"467-83-6427");
		fthOne.setEducationLevel("Undergrad");
		fthOne.setDirectDeposit(true);
		fthOne.setAge(57);
		fthOne.introduce(false);
		System.out.println("Total Pay: $" + fthOne.computePay(45)); //$100 * 40 + 110 * 5
		
		System.out.println();
		
		FullTimeHourly fthTwo = new FullTimeHourly("Ron", "Weasley",consistentAddress, 66666, 100.0,110.0,"123-75-1356");
		fthTwo.setEducationLevel("Undergrad");
		fthTwo.setDirectDeposit(true);
		fthTwo.setAge(38);
		fthTwo.introduce(true);
		System.out.println("Total Pay: $" + fthOne.computePay(30)); //$100 * 30
		
		System.out.println();
		
		PartTimeHourly pthOne = new PartTimeHourly("Watermelon", "Sugar", consistentAddress, 77777, 10.0, "742-74-7632");
		pthOne.setEducationLevel("Undergrad");
		pthOne.setDirectDeposit(true);
		pthOne.setAge(19);
		pthOne.introduce(false);
		System.out.println("Total Pay: $" + pthOne.computePay(51)); //over 40 hours so should return -1
		
		System.out.println();
		
		PartTimeHourly pthTwo = new PartTimeHourly("Falling", "Styles", consistentAddress, 88888, 10.0, "346-23-7424");
		pthTwo.setEducationLevel("Undergrad");
		pthTwo.setDirectDeposit(true);
		pthTwo.setAge(23);
		pthTwo.introduce(true);
		System.out.println("Total Pay: $" + pthTwo.computePay(10)); //10 hours * 10 dollars per hour = 100 dollars in total pay
		
		System.out.println();
		
		Contractor cOne = new Contractor("Green", "Grass", consistentAddress, 99999, 15.0, "624-75-2947");
		cOne.setEducationLevel("Undergrad");
		cOne.setDirectDeposit(true);
		cOne.setAge(18);
		cOne.introduce(false);
		System.out.println("Total Pay: $" + cOne.computePay(10)); //10 hours * 15 per hour = 150 dollars
		
		System.out.println();
		
		Contractor cTwo = new Contractor("Red", "Ball", consistentAddress, 10101, 15.0, "724-82-8141");
		cTwo.setEducationLevel("Undergrad");
		cTwo.setDirectDeposit(true);
		cTwo.setAge(73);
		cTwo.introduce(true);
		System.out.println("Total Pay: $" + cTwo.computePay(100)); //100 hours * 15 per hour = 1500 dollars
		
		System.out.println();
		
		Customer custOne = new Customer("Sadhana", "Indukuri", consistentAddress, 11111, "976-12-7197");
		custOne.setAge(20);
		custOne.setPayPreference("card");
		custOne.introduce();
		custOne.makePayment();
		
		System.out.println();
		
		Customer custTwo = new Customer("Meghana", "Indukuri", consistentAddress, 12121, "542-24-1084");
		custTwo.setAge(16);
		custTwo.setPayPreference("cash");
		custTwo.introduce();
		custTwo.makePayment();
		
		
	}

}
