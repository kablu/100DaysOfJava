import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReThrowDemo
{
	public static void main(String[] args)
	{

		try
		{
			new ReThrowDemo().getFileInfo();
		}
		catch (IOException e)
		{
			System.out.println("Exception handled.");
		}

		System.out.println("normal flow...");

	}

	private void getFileInfo() throws IOException
	{

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the fileName : ");
		String fileName = scanner.nextLine();
		scanner.close();

		/*
		 * Wrap a BufferedReader around FileReader.
		 */
		BufferedReader bufferedReader;
		try
		{
			bufferedReader = new BufferedReader(new FileReader(
					fileName));

			/*
			 * Use the readLine method of the BufferedReader
			 * to read one line at a time. the readLine
			 * method returns null when there is nothing
			 * else to read.
			 */
			String line = null;

			while ((line = bufferedReader.readLine()) != null)
			{
				System.out.println(line);
			}

			// Close the BufferedReader when we're done.
			bufferedReader.close();
		}
		catch (IOException e)
		{
			System.out.println("Rethrowing the IOException");
			/*
			 * We can rethrow an exception by throwing same
			 * exception in catch block
			 */
			throw e;
		}
	}

}