import java.io.PrintStream;
import java.util.Scanner;

/**
 * This app (Exercise01) prompts the user for a time. If the input adheres the
 * input requirements, then the app prints to the console the number of minutes
 * that passed since the start of that day. Otherwise, this app crashes or has
 * possibly incorrect behaviours.
 * 
 * The start of the Xth day is defined as midnight of the (X-1)th day. For
 * instance, the start of the day Tuesday Jan 02, 2018 is defined as the
 * midnight of Monday Jan 1st (12:00am). See
 * http://en.wikipedia.org/wiki/12-hour_clock
 * 
 * The smallest value is 12:00, for which 0 minutes have elapsed since the start
 * of the day (i.e., 0 hours * 60 minutes + 0 minutes = 0 + 0 = 0). The largest
 * value is 11:59, for which 719 minutes have elapsed since the start of the day
 * (i.e., 11 hours * 60 minutes + 59 minutes = 660 + 59 = 719).
 * 
 * *** Required User Input ***
 * 
 * (1) two colon-delimited tokens (e.g., h:m). Let the tokens be denoted h and
 * m, respectively. The colon may be prefixed or suffixed with an arbitrary
 * number of space characters.
 * 
 * (2) each of the two tokens can be parsed as an int
 * 
 * (3) The first token, h, has a value 0 < h <=12. The second token, m, has a
 * value 0 <= m <= 59.
 * 
 * *** App Behaviour: ***
 * 
 * If the user's input conforms to the requirements, then the app prints a value
 * as described above. Otherwise, there are no guarantees about this app's
 * behaviour. It may crash, or it may output a number that is correct or
 * incorrect.
 * 
 * *** Sample 1: ***
 * 
 * Input: 11:50
 * 
 * Output: 710
 * 
 * e.g., 11 * 60 + 50 = 710
 * 
 * *** Sample 2: ***
 * 
 * Input: 12:10  (or 0:10)
 * 
 * Output: 10
 * 
 * e.g., 0 * 60 + 10 = 10 (because 12:00 am is the start of the day, see above
 * for further explanation)
 * 
 * *** Sample 3: ***
 * 
 * Input: 56
 * 
 * Output: unspecified (app may or may not crash)
 * 
 * *** Sample 4: ***
 * 
 * Input: "" (i.e., the empty string)
 * 
 * Output: unspecified (app may or may not crash)
 * 
 * *** Sample 5: ***
 * 
 * Input: asd:asd
 * 
 * Output: unspecified (app may or may not crash)
 * 
 * *** Sample 6: ***
 * 
 * Input: 14:20
 * 
 * Output: unspecified (app may or may not crash, may produce some number,
 * perhaps 140, whereas the actual number of minutes elapsed since the start of
 * the day is 14*60+20=860)
 * 
 * *** End of Samples ***
 * 
 * @author [INSERT YOUR NAME/STUDENT NUMBER HERE]
 * 
 */
public class Exercise01 {

	public static void main(String[] args) {

		/*
		 * Start by setting up variables for input and output.
		 */
		PrintStream output = System.out;
		Scanner input = new Scanner(System.in); // place input.close(); as the
												// final statement to eliminate
												// the compiler warning.

		/*
		 * Here is a statement that is provided to you, to get you started. We
		 * begin by prompting the user to provide the input.
		 */

		final String PROMPT = "Enter \"h:m\" (where 0 <= h <= 12 and 0 <= m < 60): ";
		output.printf(PROMPT);


	}
}
