package main;

import static java.lang.System.out;
import pset.aa_one.ThreeFiveSum;
import pset.ab_two.Fibonacchi;
import pset.ac_three.PrimeFactor;
import pset.ad_four.Palindrome;
import pset.ae_five.SmallestMultiple;
import pset.af_six.SumsAndSquares;
import pset.ag_seven.MorePrimes;
import pset.ah_eight.ProductSeries;
import pset.ai_nine.PythagTriple;
import pset.aj_ten.PrimeSum;
import pset.ak_eleven.GridProduct;
import pset.al_twelve.TriangNum;
import pset.am_thirteen.LargeSum;
import pset.ap_sixteen.PowerDigitSum;
import pset.aq_seventeen.NumberLetters;
import pset.ar_eighteen.PathSum;
import pset.as_nineteen.CountingSundays;
import pset.at_twenty.FactorialDigitSum;
import pset.au_twentyone.AmicableNumbers;
import pset.av_twentytwo.NameScores;
import pset.aw_twentythree.NonAbundantSums;
import pset.co_sixtyseven.PathSumLarge;

public class Main {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis(); // Time start
		ThreeFiveSum.run(); 		// problem 1
		Fibonacchi.run(); 			// problem 2
		PrimeFactor.run(); 			// problem 3
		Palindrome.run(); 			// problem 4
		SmallestMultiple.run(); 	// problem 5
		SumsAndSquares.run(); 		// problem 6
		MorePrimes.run(); 			// problem 7
		ProductSeries.run(); 		// problem 8
		PythagTriple.run(); 		// problem 9
		PrimeSum.run(); 			// problem 10
		GridProduct.run(); 			// problem 11
		TriangNum.run(); 			// problem 12
		LargeSum.run(); 			// problem 13
		PowerDigitSum.run(); 		// problem 16
		NumberLetters.run(); 		// problem 17
		PathSum.run();				// problem 18
		CountingSundays.run(); 		// problem 19
		FactorialDigitSum.run(); 	// problem 20
		AmicableNumbers.run(); 		// problem 21
		NameScores.run(); 			// problem 22
		NonAbundantSums.run(); 		// problem 23
		PathSumLarge.run(); 		// problem 67
		long endTime = System.currentTimeMillis(); // Time end
		out.println("\n" + (endTime - startTime)
				+ " ms taken to complete calculations.");
	}

	private static void timer(long start, long finish) { // Deprecated, takes in
															// different
															// System.nanoTime()
															// readings and
															// prints time taken
															// in seconds.
		long timeTaken = finish - start;
		String timeFormatted = "0.";
		int count = String.valueOf(timeTaken).length();
		for (int i = 9 - count; i > 0; i--)
			timeFormatted += "0";
		timeFormatted += String.valueOf(timeTaken);
		out.println("\n" + timeFormatted
				+ " ms taken to complete calculations.");

	}
}