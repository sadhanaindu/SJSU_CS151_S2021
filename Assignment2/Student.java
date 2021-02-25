/**
 * 
 * @author sadhanaindukuri
 * @version 1.0
 * @since 02-24-2021
 * 
 * <h1>Student Class</h1>
 * This is a class that represents a student that is enrolled at San Jose State University. 
 *
 */
public class Student {
	/**
	 * private String attribute
	 */
	private String firstName;
	/**
	 * private String attribute
	 */
	private String lastName;
	/**
	 * private primatve int attribute
	 */
	private int age;
	/**
	 * private float attribute
	 */
	private float gpa;
	/**
	 * private String attribute
	 */
	private String major;
	/**
	 * private String attribute
	 */
	private String department;
	
	/**
	 * Creates a student with the given parameters. Creates instance of the student class. 
	 * 
	 * @param firstName is the first name of the student
	 * @param lastName is the last name of the student
	 * @param age is the age of the student in years
	 * @param gpa is the grade point average of the student on a 4.0 scale
	 * @param major the major of the student at San Jose State University 
	 * @param department the department of the student at San Jose State University 
	 * @author sadhanaindukuri
	 */
	public Student(String firstName, String lastName, int age, float gpa, String major, String department)
	{
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
		setGpa(gpa);
		setMajor(major);
		setDepartment(department);
	}
	
	/**
	 * Sets the the name of the student to the given parameter
	 * @param firstName is the first name of the student
	 */
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	/**
	 * first name getter method
	 * @return a string with the first name of the student
	 */
	
	public String getFirstName()
	{
		return this.firstName;
	}
	/**
	 * setter method for the last name of student
	 * @param lastName is the last name of the student
	 */
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	/**
	 * last name getter method
	 * @return a string that is the last name of the student
	 */
	public String getLastName()
	{
		return this.lastName;
	}
	
	/**
	 * setter method for the age of the student
	 * @param age is the age of the student in years
	 */
	public void setAge(int age)
	{
		this.age = age;
	}
	
	/**
	 * getter method for age of the student
	 * @return the age of the student in years
	 */
	public int getAge()
	{
		return this.age;
	}
	
	/**
	 * setter method for the GPA of the student
	 * @param gpa is the grade point average of the student
	 */
	public void setGpa(float gpa)
	{
		this.gpa = gpa;
	}
	
	/**
	 * getter method for the GPA of the student
	 * @return a float that gives the GPA of the student on a 4.0 scale
	 */
	public float getGpa()
	{
		return this.gpa;
	}
	
	/**
	 * setter method for the major of the student at San Jose State University
	 * @param major is the major of the student in San Jose University
	 */
	public void setMajor(String major)
	{
		this.major = major;
	}
	
	/**
	 * getter method for the major of the student at San Jose State University
	 * @return a string that is the major of the student in San Jose University 
	 */
	public String getMajor()
	{
		return this.major;
	}
	
	/**
	 * setter method for the department that the student studies in within San Jose State University
	 * @param department is the department that the student studies in within San Jose State University
	 */
	public void setDepartment(String department)
	{
		this.department = department;
	}
	
	/**
	 * getter method for department that the student studies in within San Jose State University
	 * @return a string that is the department that the student studies in within San Jose State University
	 */
	public String getDepartment()
	{
		return this.department;
	}
	
	/**
	 * 
	 * @author sadhanaindukuri
	 * @version 1.0
	 * @since 02-24-2021
	 * <h1>Course Class</h1>
	 * This is a non-static inner class that is nested within the Student class. It prints out the
	 * course schedule of a student
	 *
	 */
	class Course
	{
		public void printSchedule()
		{
			System.out.println("CS151 Tue/Thur 6-7:15");
			System.out.println("Eng101 Mon/Wed 10-11:15");
			System.out.println("Hist100 Tue/Thur 1:30-2:45");
		}
	}
	
	

}
