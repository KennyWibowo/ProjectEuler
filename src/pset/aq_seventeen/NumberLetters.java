package pset.aq_seventeen;

import static java.lang.System.out;

public class NumberLetters {

	// declarations for integers
	static int one = 3;
	static int two = 3;
	static int three = 5;
	static int four = 4;
	static int five = 4;
	static int six = 3;
	static int seven = 5;
	static int eight = 5;
	static int nine = 4;
	static int ten = 3;
	static int eleven = 6;
	static int twelve = 6;
	static int thirteen = 8;
	static int fourteen = 8;
	static int fifteen = 7;
	static int sixteen = 7;
	static int seventeen = 9;
	static int eighteen = 8;
	static int nineteen = 8;
	static int eleventy = 8;
	static int twenty = 6;
	static int thirty = 6;
	static int fourty = 6;
	static int fifty = 5;
	static int sixty = 5;
	static int seventy = 7;
	static int eighty = 6;
	static int ninety = 6;
	static int hundred = 7;
	static int thousand = 8;
	static int and = 3;

	public static void run() {
		int sum = one + two + three + four + five + six + seven + eight + nine
				+ thousand;
		for (int i = 1; i <= 100; i++) { // counts by tens

			if (i % 10 == 1) { // special case for n11-n19
				sum += ten + eleven + twelve + thirteen + fourteen + fifteen
						+ sixteen + seventeen + eighteen + nineteen;
			} else {
				sum += one + two + three + four + five + six + seven + eight
						+ nine;
			}

			if (i % 10 == 2) {
				sum += twenty;
			} else if (i % 10 == 3) {
				sum += thirty;
			} else if (i % 10 == 4) {
				sum += fourty;
			} else if (i % 10 == 5) {
				sum += fifty;
			} else if (i % 10 == 6) {
				sum += sixty;
			} else if (i % 10 == 7) {
				sum += seventy;
			} else if (i % 10 == 8) {
				sum += eighty;
			} else if (i % 10 == 9) {
				sum += ninety;
			}

			if (i > 10) { // one hundred and above
				sum += hundred;
				if (i % 10 != 0) { // tests for one hundred, two hundred...
									// (requires no 'and')
					sum += and;
				}
			}

		}
		out.println("The sum of the number of letters in numbers 1-1000 is "
				+ sum);
	}
}
