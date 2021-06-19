import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * Predefined Character Classes
 * 
 * The Java regex API also accepts predefined character classes.One
 * special aspect of the Java version of this regex is the escape
 * character.
 * 
 * As we will see, most characters will start with a backslash, which
 * has a special meaning in Java. For these to be compiled by the
 * Pattern class � the leading backslash must be escaped i.e. \s
 * becomes \\s.
 *
 */
public class RegexDemo
{

	public static void main(String[] args)
	{
		/*
		 * Matching white space:
		 */
		calculateMatches("\\s", "a    c");
		/*
		 * Matching non-white space:
		 */
		calculateMatches("\\S", "a    c");
	}

	private static void calculateMatches(String regex, String inputText)
	{
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(inputText);
		int matches = 0;

		/*
		 * The find method keeps advancing through the input text and
		 * returns true for every match, so we can use it to find the
		 * match count as well:
		 */
		while (matcher.find())
		{
			++matches;
		}
		System.out.println("Number of Matches = " + matches);
	}

}
