import java.util.EnumMap;

/**
 * public void clear() 
 * 
 * Removes all mappings from this map.
 * 
 */

public class EnumMapDemo
{

	public enum Month
	{
		JAN, FEB, MAR, APR, MAY
	};

	public static void main(String[] args)
	{
		EnumMap<Month, String> enumMap = new EnumMap<Month, String>(
				Month.class);

		enumMap.put(Month.JAN, "January month is cool");
		enumMap.put(Month.FEB, "February month is cool");
		enumMap.put(Month.MAR, "March month is less hot");
		enumMap.put(Month.MAY, "May month is hot");

		System.out.println("Before clear, enumMap = " + enumMap);

		/*
		 * Removes all mappings from this map.
		 */
		enumMap.clear();
		System.out.println("After clear, enumMap = " + enumMap);

	}

}
