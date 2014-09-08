package pset.ap_sixteen;

import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;

public class PowerDigitSum {
	public static void run() {
		BigInteger num = new BigInteger("1");
		for (int i = 0; i <1000; i++) {
			num = num.multiply(new BigInteger("2"));
		}
		char[] output = num.toString().toCharArray();
		int sum = 0;
		
		for(int i = 0; i < output.length; i++){
			sum += Integer.valueOf(String.valueOf(output[i]));
		}
		out.println("The sum of the digits of 2^1000 is " + sum);
	}


}
