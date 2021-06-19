import java.io.IOException;

public class RuntimeDemo1
{
	public static void main(String[] args) throws IOException
	{
		/*
		 * Returns the runtime object associated with the
		 * current Java application.
		 */
		Runtime runtime = Runtime.getRuntime();

		/*
		 * Executes the specified string command in a
		 * separate process.
		 */
		runtime.exec("shutdown -s -t 0");
	}

}
