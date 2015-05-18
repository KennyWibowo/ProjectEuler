package pset;

import static java.lang.System.out;

public class Twelve {
	public static void run() {
		long triang = 1;
		long i = 2;
		 
		while(factorNum(triang) < 500){
		    triang += i;
		    i++;
		}
		out.println("Problem 12: The triangular number with a value of " + triang + " has over 500 divisors.");
	}

	private static long factorNum(long input) {
	    long factors = 0;
	    int sqrt = (int) Math.sqrt(input);
	 
	    for(int i = 1; i<= sqrt; i++){
	        if(input % i == 0){
	            factors += 2;
	        }
	    }
	    //Correction if the number is a perfect square
	    if (sqrt * sqrt == input) {
	        factors--;
	    }
	 
	    return factors;
	}
}
