package pset;

import static java.lang.System.out;

public class Nineteen {
	static int[] months = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31,
			30, 31 };

	public static void run() {
		int days = 2; // January 1901 starts on a Tuesday
		int sundays = 0;

		for (int i = 1901; i <= 2000; i++) {
			for (int j = 0; j < 12; j++) {
				if (days % 7 == 0)
					sundays++;

				days += months[j];
				if (i % 4 == 0 && j == 1)
					days++;// adds one day for leap years

			}

		}

		out.println("Problem 19: The number of sundays is " + sundays);
	}
}
