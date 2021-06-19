import java.time.Period;
import java.time.Year;

public class YearDemo3
{

	public static void main(String[] args)
	{
		Year year1 = Year.of(2017);
		System.out.println("year1 = " + year1);

		Period period = Period.ofYears(9);
		System.out.println("period = " + period);

		/*
		 * Parameters:
		 * 
		 * amountToSubtract - the amount to subtract, not null
		 * 
		 * Returns:
		 * 
		 * a Year based on this year with the subtraction made, not
		 * null
		 */
		Year year2 = year1.minus(period);
		System.out.println("year2 = " + year2);
	}

}
