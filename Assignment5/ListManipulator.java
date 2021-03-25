import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

/**
 * 
 * @author sadhanaindukuri
 * @version 1.0
 * @since 03-24-2021
 * 
 * <h1>Course Class</h1>
 * This is a class that manipulates lists.  
 *
 */

public class ListManipulator {
	
	/**
	 * private ArrayList attribute
	 */
	private ArrayList<Integer> myLst = new ArrayList<Integer>();
	
	/**
	 * Creates instance of ListManipulator
	 * @param myLst the array list that will be manipulated
	 */
	public ListManipulator(ArrayList<Integer> myLst)
	{
		this.myLst = myLst;
	}

	/**
	 * getter method for the array list
	 * @return the array list attribute
	 */
	public ArrayList<Integer> getMyLst() {
		return myLst;
	}

	/**
	 * setter method for the array list
	 * @param myLst
	 */
	public void setMyLst(ArrayList<Integer> myLst) {
		this.myLst = myLst;
	}
	
	/**
	 * sorts the array list based on whether the user wants it in ascending or descending order
	 * @param myLst the array list that will be sorted
	 * @param ascending boolean value that will determine whether sorting is done ascending or descending
	 * @return sorted array list
	 */
	ArrayList<Integer> sort(ArrayList<Integer> myLst, Boolean ascending)
	{
		
		if(ascending)
		{
			Collections.sort(myLst);
		}
		
		else
		{
			Collections.sort(myLst, Collections.reverseOrder());
		}
		
		return myLst;
		
	}
	
	/**
	 * swaps the largest value and smallest value in the array list
	 * @param myLst the array list that will have the swapping occur in i t
	 * @return an array list that has the largest and smallest values swapped
	 */
	ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myLst)
	{
		
		int minIndex = myLst.indexOf(Collections.min(myLst));
		int maxIndex = myLst.indexOf(Collections.max(myLst));
		
		if(minIndex != -1 && maxIndex != -1)
		{
			Collections.swap(myLst, minIndex, maxIndex);
		}
		
		return myLst;
		
	}
	
	/**
	 * prints out a table that has the sorted values of the array list and how often they occur
	 * @param myLst the array list that will be printed out in the table
	 */
	void table(ArrayList<Integer> myLst)
	{
		TreeSet<Integer> table = new TreeSet<Integer>(myLst);
		
		for (Integer value : table)
		{
			System.out.println(value + " occurs " + Collections.frequency(myLst, value) + " times.");
		}
	}
	
	/*public static void main(String [] args)
	{
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(7);
		input.add(9);
		input.add(4);
		input.add(3);
		input.add(7);
		input.add(7);
		input.add(145);
		input.add(2);
		input.add(2);
		
		ListManipulator test = new ListManipulator(input);
		
		for(Integer value : test.getMyLst())
		{
			System.out.print(value + " ");
		}
		
		System.out.println();
		
		
		test.sort(test.getMyLst(), false);
		
		System.out.print("Sorted: " );
		for(Integer value : test.getMyLst())
		{
			System.out.print(value + " ");
		}
		
		System.out.println( ); 
		
		test.swapLargestSmallest(test.getMyLst());
		
		System.out.print("Swapped: " );
		for(Integer value : test.getMyLst())
		{
			System.out.print(value + " ");
		}
		
		System.out.println();
		
		
		test.table(test.getMyLst());
		
		
	} */
	

}
