package pset;

import static java.lang.System.out;

public class One {

	public static void run() {
		int sum = 0;
		for (int i = 0; i < 334; i++) {
			sum += 3 * i;
		}
		for (int i = 0; i < 200; i++) {
			sum += 5 * i;
		}
		for (int i = 0; i < 67; i++) {
			sum -= 15 * i;
		}
		out.println("Problem 1: The sum is: " + sum);
	}

}