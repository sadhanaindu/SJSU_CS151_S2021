import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * 
 * @author sadhanaindukuri
 * @version 1.0
 * @since 03-24-2021
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
	 * private Course attribute
	 */
	private LinkedList<Course> courses;
	
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
	public Student(String firstName, String lastName, int age, float gpa, String major, String department, LinkedList<Course> courses)
	{
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
		setGpa(gpa);
		setMajor(major);
		setDepartment(department);
		setCourses(courses);
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
	 * getter method for the courses that the student studies in within San Jose State University
	 * @return a course that is representative of the courses that the student studies in within San Jose State University
	 */
	public LinkedList<Course> getCourses() {
		return courses;
	}

	/**
	 * setter method for the courses that the student studies in within San Jose State University
	 * @param course is a list of courses that the student studies in within San Jose State University
	 */
	public void setCourses(LinkedList<Course> courses) {
		this.courses = courses;
	}
	
	/**
	 * adds a course to the linked list of courses
	 * @param course is the course that will be added to the list
	 */
	public void addCourse(Course course)
	{
		courses.add(course);
	}
	
	/**
	 * removes a course to the linked list of courses
	 * @param course is the course that will be removed from the list
	 */
	public void removeCourse(Course course)
	{
		courses.remove(course);
	}
	
	/**
	 * sorts the list based on the attribute of the Course class that the user gives and whether 
	 * they want the list to be ascending or descending
	 * @param ascending a boolean value that determines whether the list will be ascending or descending
	 * @param attribute a attribute of the course class that will determine how the list will be sorted
	 */
	public void sortCourses(boolean ascending, String attribute)
	{
		if(attribute.contentEquals("courseName"))
		{
			Comparator<Course> courseNameComparator = new Comparator<Course>()
			{
				@Override
				public int compare(Course o1, Course o2) 
				{
					return o1.getCourseName().compareTo(o2.getCourseName());
				}
				
			};
			
			Collections.sort(courses, courseNameComparator);
		}
		
		else if(attribute.contentEquals("courseDescription"))
		{
			Comparator<Course> courseDescriptionComparator = new Comparator<Course>()
			{
				@Override
				public int compare(Course o1, Course o2) 
				{
					return o1.getCourseDescription().compareTo(o2.getCourseDescription());
				}
				
			};
			
			Collections.sort(courses, courseDescriptionComparator);
			
		}
		
		else if(attribute.contentEquals("department"))
		{
			Comparator<Course> departmentComparator = new Comparator<Course>()
			{
				@Override
				public int compare(Course o1, Course o2) 
				{
					return o1.getDepartment().compareTo(o2.getDepartment());
				}
				
			};
			
			Collections.sort(courses, departmentComparator);
			
		}
		
		else if(attribute.contentEquals("courseTime"))
		{
			Comparator<Course> courseTimeComparator = new Comparator<Course>()
			{
				@Override
				public int compare(Course o1, Course o2) 
				{
					return o1.getCourseTime().compareTo(o2.getCourseTime());
				}
				
			};
			
			Collections.sort(courses, courseTimeComparator);
			
		}
		
		else
		{
			Comparator<Course> dayComparator = new Comparator<Course>()
			{
				@Override
				public int compare(Course o1, Course o2) 
				{
					return o1.getDay().compareTo(o2.getDay());
				}
				
			};
			
			Collections.sort(courses, dayComparator);
		}
		
		if(!ascending)
		{
			Collections.reverse(courses);
		}
		
		for(Course key: courses)
		{
			System.out.println(key.toString());
		}
	}
	
	/*public static void main(String[] args)
	{
		Course course1 = new Course("CS 151", "Object Oriented Design and Programming", "CS", "6:00 pm", "Tue");
		Course course2 = new Course("CS 146", "Data Structures and Algorithms", "CMPE", "3:00 pm", "Fri");
		Course course3 = new Course("CMPE 131", "Software Engineering", "SE", "9:00 am", "Wed");
		LinkedList<Course> test = new LinkedList<Course>();
		
		test.add(course1);
		test.add(course2);
		test.add(course3);
		
		Student sadhana = new Student("Sadhana", "Indukuri", 20, 3.9f, "Software Engineering", "Engineering", test);
		sadhana.sortCourses(false, "day");
		System.out.println();
		sadhana.removeCourse(course1);
		sadhana.sortCourses(false, "day");
		System.out.println();
		sadhana.addCourse(course1);
		sadhana.sortCourses(false, "day");
		
	} */

}
