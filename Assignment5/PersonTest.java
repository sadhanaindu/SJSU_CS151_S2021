import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 
 * @author sadhanaindukuri
 * @version 1.0
 * @since 03-124-2021
 * 
 * <h1>PersonTest Class</h1>
 * This is a class that tests whether the Person class I coded work correctly.
 * 
 *  <h2>Compile Instructions</h2>
 *  Compile by running the following command: {@code javac PersonTest.java}
 *  
 *  <h2>Execute Instructions</h2>
 *  Execute by running the following command: {@code java PersonTest}
 *
 */

public class PersonTest {
	
	public static void main(String [] args)
	{
		Person joe = new Person("Joe", "Smith", 40);
		Person amy = new Person("Amy", "Gold", 32);
		Person tony = new Person("Tony", "Stork", 21);
		Person sean = new Person("Sean", "Irish", 24);
		Person tina = new Person("Tina", "Brock", 28);
		Person lenny = new Person("Lenny", "Hep", 18);
		
		ArrayList<Person> test = new ArrayList<Person>();
		test.add(amy);
		test.add(joe);
		test.add(tony);
		test.add(sean);
		test.add(tina);
		test.add(lenny);
		
		Comparator<Person> firstNameComparator = new Comparator<Person>()
		{
			@Override
			public int compare(Person o1, Person o2) 
			{
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
			
		};
		
		Comparator<Person> lastNameComparator = new Comparator<Person>()
		{
			@Override
			public int compare(Person o1, Person o2) 
			{
				return o1.getLastName().compareTo(o2.getLastName());
			}
			
		};
		
		Comparator<Person> ageComparator = new Comparator<Person>()
		{
			@Override
			public int compare(Person o1, Person o2) 
			{
				return o1.getAge() - o2.getAge();
			}
			
		};
		System.out.println("First Name Ascending: ");
		Collections.sort(test, firstNameComparator);
		for(Person key: test)
		{
			System.out.println(key.toString());
		}
		
		System.out.println();
		System.out.println("First Name Descending: ");
		Collections.reverse(test);
		for(Person key: test)
		{
			System.out.println(key.toString());
		}
		
		System.out.println();
		System.out.println("Last Name Ascending: ");
		Collections.sort(test, lastNameComparator);
		for(Person key: test)
		{
			System.out.println(key.toString());
		}
		
		System.out.println();
		System.out.println("Last Name Descending: ");
		Collections.reverse(test);
		for(Person key: test)
		{
			System.out.println(key.toString());
		}
		
		System.out.println();
		System.out.println("Age Ascending: ");
		Collections.sort(test, ageComparator);
		for(Person key: test)
		{
			System.out.println(key.toString());
		}
		
		System.out.println();
		System.out.println("Age Descending: ");
		Collections.reverse(test);
		for(Person key: test)
		{
			System.out.println(key.toString());
		}
		
	}

}
