package pset.ap_sixteen;

import static java.lang.System.out;

import java.math.BigInteger;

public class PowerDigitSum {

	public static void run() {
		BigInteger num = new BigInteger("1");
		for (int i = 0; i < 1000; i++) {
			num = num.multiply(new BigInteger("2"));
		}
		char[] output = num.toString().toCharArray();
		int sum = 0;

		for (int i = 0; i < output.length; i++) {
			sum += Integer.valueOf(String.valueOf(output[i]));
		}
		out.println("Problem 16: The sum of the digits of 2^1000 is " + sum);
	}

}
