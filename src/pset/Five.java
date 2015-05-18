package pset;

import static java.lang.System.out;

import java.util.ArrayList;

public class Five {
	public static void run() {
		int smallMultiple = 2;
		for (int i = 2; i <= 20; i++) {
			int current = i;
			ArrayList<Integer> primes = getPrimes(smallMultiple);

			for (int j = 0; j < primes.size(); j++)
				if (current % primes.get(j) == 0)
					current /= primes.get(j);

			smallMultiple *= current;
		}

		out.println("Problem 5: The answer is " + smallMultiple);
	}

	private static ArrayList<Integer> getPrimes(int num) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for (int i = 2; i <= num; i++) {
			while (num % i == 0) {
				primes.add(i);
				num /= i;
			}
		}
		return primes;
	}

}
