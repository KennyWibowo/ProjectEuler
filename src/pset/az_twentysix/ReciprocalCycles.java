package pset.az_twentysix;

import static java.lang.System.out;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ReciprocalCycles {
	public static void run() {
		int max = 0;
		int place = 0;
		out.println(repetition(9));
		for(int i = 2; i< 1000; i++){
			int temp = repetition(i);
			if(temp > max){
				place = i;
				max = temp;
			}
			out.println(i + " " + place + " " + max);

		}
		out.println("Problem 26: The max number is: " + max);
	}

	private static int repetition(int input) {
		try {
			BigDecimal dec = BigDecimal.ONE;
			dec.divide(new BigDecimal(input));
		} catch (ArithmeticException e) {
			
			if(input%5 == 0)
				while(input%5==0)
					input/=5;
			
			if(input%2 == 0)
				while(input%2==0)
					input/=2;
			
			if(isPrime(input))
				return input-1;
			
			int n = 9;
			int k = 1;
			
			while (n % input != 0) {
				n = (n * 10) + 9;
				k++;
			}
			
			return k;
		}
		return -1;
	}
	
	private static boolean isPrime(long n) {
		for (int j = 2; j <= Math.sqrt(n); j++)
			if (0 == n % j)
				return false;

		return true;

	}

}