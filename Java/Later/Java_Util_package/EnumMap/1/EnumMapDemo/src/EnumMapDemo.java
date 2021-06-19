import java.util.EnumMap;

/**
 * public EnumMap(Class<K> keyType)
 * 
 * Creates an empty enum map with the specified key type.
 * 
 * Parameters:
 * 
 * keyType - the class object of the key type for this enum map
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
		/*
		 * Creates an empty enum map with the specified key type.
		 */
		EnumMap<Month, String> enumMap = new EnumMap<Month, String>(
				Month.class);

		enumMap.put(Month.JAN, "January month is cool");
		enumMap.put(Month.FEB, "February month is cool");
		enumMap.put(Month.MAR, "March month is less hot");
		enumMap.put(Month.MAY, "May month is hot");
		
		System.out.println("enumMap = "+enumMap);
	}

}
