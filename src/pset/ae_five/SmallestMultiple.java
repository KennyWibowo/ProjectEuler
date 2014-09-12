package pset.ae_five;

import static java.lang.System.out;

import java.util.ArrayList;

public class SmallestMultiple {
	public static void run() {
		long smallMultiple = 1;
		ArrayList<Long> primes = new ArrayList<Long>();
		for (int i = 2; i <= 20; i++) {
			primes = addTwoArrays(primes, getPrimes(i));
		}

		for (int i = 0; i < primes.size(); i++) {
			smallMultiple *= primes.get(i);
		}
		out.println(smallMultiple);
	}

	private static ArrayList<Long> getPrimes(int num) {
		ArrayList<Long> primes = new ArrayList<Long>();
		for (long i = 2; i <= num; i++) {
			while (num % i == 0) {
				primes.add(i);
				num /= i;
			}
		}
		return primes;
	}

	private static ArrayList<Long> addTwoArrays(ArrayList<Long> first,
			ArrayList<Long> addened) {
		for (int i = 0; i < first.size() - 1; i++) {
			for (int j = 0; j < addened.size() - 1; i++) {
				// out.println(first.size() + "-> Size of First");
				// out.println(i/* + ": " + first.get(i)*/);
				// out.println(j + ": " + addened.get(j));
				if (first.get(i) == addened.get(j)) {
					out.println(addened.get(j) + " will be removed.");
					addened.remove(j);
					j--;
					i++;
				}
			}
		}
		for (int i = 0; i < addened.size(); i++) {
			first.add(addened.get(i));
		}
		return first;
	}
}
