package pset.au_twentyone;

import static java.lang.System.out;

public class AmicableNumbers {
	public static void run() {
		int sum = 0;
		for (int i = 0; i < 10000; i++)
			if (amicability(i))
				sum += i;

		out.println("Problem 21: The sum of all amicable pairs under 10,000 is " + sum);
	}

	private static boolean amicability(int input) {
		int pair = divisorSum(input);
		if (pair != input && input == divisorSum(pair))
			return true;

		return false;
	}

	private static int divisorSum(int input) {
		int sum = 0;
		for (int i = 1; i < input; i++)
			if (input % i == 0)
				sum += i;

		return sum;
	}
}
