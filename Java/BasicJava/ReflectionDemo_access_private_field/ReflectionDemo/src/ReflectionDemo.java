import java.lang.reflect.Field;

/**
 *
 * Despite the common belief it is actually possible to access private fields
 * and methods of other classes via Java Reflection. It is not even that
 * difficult. This can be very handy during unit testing.
 *
 */
public class ReflectionDemo
{
	public static void main(String[] args)
	{
		try
		{
			Class classObj = Student.class;
			Field privateFieldObj = classObj.getDeclaredField("name");
			/*
			 * Set the accessible flag for this object to the indicated boolean
			 * value. A value of true indicates that the reflected object should
			 * suppress Java language access checking when it is used. A value
			 * of false indicates that the reflected object should enforce Java
			 * language access checks.
			 *
			 * First, if there is a security manager, its checkPermission method
			 * is called with a ReflectPermission("suppressAccessChecks")
			 * permission.
			 *
			 * By calling Field.setAcessible(true) you turn off the access
			 * checks for this particular Field instance, for reflection only.
			 * Now you can access it even if it is private, protected or package
			 * scope, even if the caller is not part of those scopes.
			 */
			privateFieldObj.setAccessible(true);
			Student student = new Student("Peter");
			String fieldValue = (String) privateFieldObj.get(student);
			System.out.println("privateNameField value = " + fieldValue);
		}
		catch (NoSuchFieldException | SecurityException
				| IllegalArgumentException | IllegalAccessException e)
		{
			e.printStackTrace();
		}

	}

}