/*
 * public int indexOf(String str, int fromIndex)
 *
 * Parameters:
 * ----------
 * str - the substring for which to search.
 *
 * fromIndex - the index from which to start
 * the search.
 *
 * Returns:
 * -------
 * the index within this string of the
 * first occurrence of the specified substring, starting
 * at the specified index.
 */
public class StringBuilderDemo
{

	public static void main(String[] args)
	{
		String str = "com.com.com";
		StringBuilder sb = new StringBuilder(str);
		System.out.println("sb = "+sb);
		// Returns 4
		int indexPosition = sb.indexOf("com", 2);
		System.out.println("indexOf(\"com\",2) = " + indexPosition);
	}
}
