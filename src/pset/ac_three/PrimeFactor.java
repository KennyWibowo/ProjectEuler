package pset.ac_three;
import static java.lang.System.out;

import java.util.ArrayList;

public class PrimeFactor {
	public static void run(){
		long num = 600851475143L;
		ArrayList<Long> primes = new ArrayList<Long>();
		for (long i = 2; i <= num; i++) {
			while (num % i == 0) {
				primes.add(i);
				num /= i;
			}
		}
		out.println("Problem 3: The primes of the given big number are:");
		for(int i=0; i<primes.size(); i++)
			out.println(primes.get(i));
	}
}
