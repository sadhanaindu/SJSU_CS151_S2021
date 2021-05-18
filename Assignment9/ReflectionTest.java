import java.lang.reflect.*;

public class ReflectionTest {
	
	public static void main(String[] args)
	{
		try {
			Class employeeClass = Class.forName("Address");
			System.out.println(employeeClass.getName());
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Address a1 = new Address(145, "Green Apple", "San Jose", "71473", "California");
		Person p1 = new Person("Sadhana","Indukuri",a1,"24562461");
		Class addressClass = a1.getClass();
		Class personClass = p1.getClass();
		
		System.out.println("\nPerson class declared methods");
		Method[] personDeclaredMethods = personClass.getDeclaredMethods();
		
		for(Method method : personDeclaredMethods)
		{
			System.out.println(method.toString());
			String methodName = method.getName();
			Class[] parameters = method.getParameterTypes();
			if(parameters.length == 0)
				System.out.println(methodName+"() has 0 parameters");
			else
				System.out.println(methodName+"() has " +parameters.length +" parameter(s) of the following types");
			for(Class p: parameters)
			{
				System.out.println("\t" + p.getName());
			}
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("\nAddress class methods");
		Method[] addressMethods = addressClass.getMethods();
		
		for(Method method : addressMethods)
		{
			System.out.println(method.toString());
			String methodName = method.getName();
			Class[] parameters = method.getParameterTypes();
			if(parameters.length == 0)
				System.out.println(methodName+"() has 0 parameters");
			else
				System.out.println(methodName+"() has " +parameters.length +" parameter(s) of the following types");
			for(Class p: parameters)
			{
				System.out.println("\t" + p.getName());
			}
		}
		System.out.println();
		System.out.println();
		
		System.out.println("\nAddress fields:");
		Field[] addressFields = addressClass.getDeclaredFields();
		
		for(Field field : addressFields)
		{
			String fieldName = field.getName();
			System.out.println(fieldName);
			System.out.println(field.toString());
		}
		
		System.out.println();
		System.out.println();
		
		try {
			Constructor<Person> personConstructor = Person.class.getConstructor(String.class, String.class, Address.class, String.class);
			Constructor<Address> addressConstructor = Address.class.getConstructor(int.class, String.class, String.class, String.class, String.class);
			Address a2 = addressConstructor.newInstance(12345, "Purple Ave", "ranch", "714323", "CA");
			Person p2 = personConstructor.newInstance("Sadhana", "Indukuri", a1, "1234567423");
			Person p3 = personConstructor.newInstance("Meghana", "Indukuri", a2, "9876543210");
			Person p4 = personConstructor.newInstance("Srinivasa", "Indukuri", a2, "913741938");
			
			Class personClasses = p2.getClass();
			Method setFirstName = personClasses.getDeclaredMethod("setFirstName",String.class);
			Method setLastName = personClasses.getDeclaredMethod("setLastName",String.class);
			Method setAge = personClasses.getDeclaredMethod("setAge",int.class);
			
			setFirstName.invoke(p2, "Sadhu");
			System.out.println(p2.toString());
			
			System.out.println();
			System.out.println();
			
			setLastName.invoke(p2, "NEW LAST NAME");
			System.out.println(p2.toString());
			
			System.out.println();
			System.out.println();
			
			setAge.invoke(p2, 20);
			System.out.println(p2.toString());
			
			System.out.println();
			System.out.println();
		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		} 
		
		
	}
	

}
