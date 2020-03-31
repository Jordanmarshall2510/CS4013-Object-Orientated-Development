import java.util.*;

public class ex3_21{
	public static void main (String args[]){

		Scanner year = new Scanner(System.in);
		System.out.println("Enter Year: ");
		String yearString = year.nextLine();
		int intYear = Integer.parseInt(yearString);

		Scanner month = new Scanner(System.in);
		System.out.println("Enter Month in Number: ");
		String monthString = month.nextLine();
		int intMonth = Integer.parseInt(monthString);

		Scanner dayOfMonth = new Scanner(System.in);
		System.out.println("Enter Day of Month: ");
		String dayOfMonthString = dayOfMonth.nextLine();
		int intDayOfMonth = Integer.parseInt(dayOfMonthString);

		int yearCentury = intYear % 100;
		int century = intYear / 100;

		int dayNumber = ((intDayOfMonth)+((26 * (intMonth + 1) / 10)) + (yearCentury)+ (yearCentury / 4) + (century / 4)+ (5*century)) % 7;

		String [] day = {"Saturday", "Sunday","Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};


		System.out.print("The day is: " + day[dayNumber]);


	}
}