/**
 * 
 * @author sadhanaindukuri
 * @version 1.0
 * @since 03-15-2021
 * 
 * <h1>Course Class</h1>
 * This is a class that represents a course that is avalible at San Jose State University. 
 *
 */
public class Course implements Cloneable{
	
	/**
	 * private String attribute
	 */
	private String courseName;
	/**
	 * private String attribute
	 */
	private String courseDescription;
	/**
	 * private String attribute
	 */
	private String department;
	/**
	 * private String attribute
	 */
	private String courseTime;
	/**
	 * private String attribute
	 */
	private String day;
	
	
	/**
	 * Creates a course with the given parameters. Creates instance of the course class. 
	 * @param courseName is the name of course available at SJSU
	 * @param courseDescription is the description of course available at SJSU
	 * @param department is the department that the course is available in at SJSU
	 * @param courseTime is the time that the course starts 
	 * @param day is the day of the week that the course is on. 
	 */
	public Course(String courseName, String courseDescription, String department, String courseTime, String day)
	{
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		this.department = department;
		this.courseTime = courseTime;
		this.day = day;
	}

	/**
	 * getter method for the name of the course
	 * @return a string that is the name of the course
	 */
	public String getCourseName() {
		return courseName;
	}

	/**
	 * setter method for the name of the course
	 * @param courseName is the name of the course
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	/**
	 * getter method for the description of the course
	 * @return a string that is the description of the course
	 */
	public String getCourseDescription() {
		return courseDescription;
	}

	/**
	 * setter method for the description of the course
	 * @param courseDescription is the description of the course
	 */
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	/**
	 * getter method for the department that offers this course
	 * @return a string that is the department that offers this course
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * setter method for the department that offers this course
	 * @param department is the department that offers this course
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * getter method for the time at which the course starts weekly
	 * @return a string that represents the time at which the course starts weekly
	 */
	public String getCourseTime() {
		return courseTime;
	}

	/**
	 * setter method for the time at which the course starts weekly
	 * @param courseTime is the time at which the course starts weekly
	 */
	public void setCourseTime(String courseTime) {
		this.courseTime = courseTime;
	}

	/**
	 * getter method for the day that the course is on
	 * @return a string that represents the day that the course is on
	 */
	public String getDay() {
		return day;
	}

	/**
	 * setter method for the day that the course is on
	 * @param day is the day that the course is on
	 */
	public void setDay(String day) {
		this.day = day;
	}
	
	/**
	 * method that does a deep copy of Course instance
	 * @return an object that is the deep copy of the Student instance
	 */
	protected Object clone() throws CloneNotSupportedException
	{
		Course course = (Course) super.clone();
		return course;
	}
	
	/**
	 * method that gives a string representation of the course.
	 */
	public String toString()
	{
		String value = getCourseName() + ", " + getCourseDescription() + ", " + getDepartment() + ", " + getCourseTime() + ", " + getDay();
		return value;
	}
	
}
