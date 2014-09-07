package pset.at_twenty;

import static java.lang.System.out;
import java.math.BigInteger;

public class FactorialDigitSum {
	public static void run() {
		char[] bigNumber = factorial(100).toString().toCharArray();
		int sum = 0;
		for(int i=0; i<bigNumber.length; i++){
			sum += Integer.parseInt(String.valueOf(bigNumber[i]));
		}
		out.println("The sum of 100!'s digits is " + sum);
	}

	public static BigInteger factorial(BigInteger input) {
		if (input.compareTo(BigInteger.ONE) <= 0) {
			return BigInteger.ONE;
		} else {
			return input.multiply(factorial(input.subtract(BigInteger.ONE)));
		}
	}

	public static BigInteger factorial(int input) {
		return factorial(BigInteger.valueOf(input));
	}
}
