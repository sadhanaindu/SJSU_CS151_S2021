/**
 * 
 * @author sadhanaindukuri
 * @version 1.0
 * @since 04-26-2021
 * 
 * <h1>MethodTest Class</h1>
 * This is a class that tests whether the generic count method I coded works correctly.
 * 
 *  <h2>Compile Instructions</h2>
 *  Compile by running the following command: {@code javac MethodTest.java}
 *  
 *  <h2>Execute Instructions</h2>
 *  Execute by running the following command: {@code java MethodTest}
 *
 */

import java.util.ArrayList;
import java.util.List;

public class MethodTest {
	
	public static <T> int count(List<T> array)
	{
		int counter = 0;
		for(T element: array)
		{
			counter++;
		}
		return counter;
	}
	
	public static void main(String [] args)
	{
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("hello");
		strings.add("my");
		strings.add("name");
		strings.add("is");
		strings.add("sadhana");
		
		System.out.println("Number of Elements in String Array: " + count(strings));
		
		ArrayList<Integer> integers = new ArrayList<Integer>();
		integers.add(1);
		integers.add(2);
		integers.add(3);
		integers.add(4);
		integers.add(5);
		integers.add(6);
		
		System.out.println("Number of Elements in Integer Array: " + count(integers));
		
		ArrayList<Double> doubles = new ArrayList<Double>();
		doubles.add(1.0);
		doubles.add(2.0);
		doubles.add(3.0);
		doubles.add(4.0);
		doubles.add(5.0);
		doubles.add(6.0);
		doubles.add(7.0);
		doubles.add(8.0);
		
		System.out.println("Number of Elements in Double Array: " + count(doubles));
	}

}
