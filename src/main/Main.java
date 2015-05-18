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
import pset.ay_twentyfive.BigFibonacci;
import pset.az_twentysix.ReciprocalCycles;
import pset.co_sixtyseven.PathSumLarge;

public class Main {
	public static void main(String[] args) {
        if ( args.length != 1 ) {
            System.out.println( "Error: need 1 param to specify problem number
        }

        int arg1 = Integer.parseInt( args[1] );

		long startTime = System.currentTimeMillis(); // Time start

        switch ( arg1 ) {
            case 1:
                ThreeFiveSum.run();         // problem 1
                break;
            case 2:
        		Fibonacchi.run();           // problem 2
                break;
            case 3:
                PrimeFactor.run();          // problem 3
                break;
            case 4:
                Palindrome.run();           // problem 4
                break;
            case 5:
                SmallestMultiple.run();     // problem 5
                break;
            case 6:
                SumsAndSquares.run();       // problem 6
                break;
            case 7:
                MorePrimes.run();           // problem 7
                break;
            case 8:
                ProductSeries.run();        // problem 8
                break;
            case 9:
                PythagTriple.run();         // problem 9
                break;
            case 10:
                PrimeSum.run();             // problem 10
                break;
            case 11:
                GridProduct.run();          // problem 11 
                break;
            case 12:
                TriangNum.run();            // problem 12
                break;
            case 13:
                LargeSum.run();             // problem 13
                break;
            case 14:
                break;
            case 16:
                PowerDigitSum.run();        // problem 16
                break;
            case 17:
                NumberLetters.run();        // problem 17
                break;
            case 18:
                PathSum.run();              // problem 18
                break;
            case 19:
                CountingSundays.run();      // problem 19
                break;
            case 20:
                FactorialDigitSum.run();    // problem 20
                break;
            case 21:
                AmicableNumbers.run();      // problem 21
                break;
            case 22:
                NameScores.run();           // problem 22
                break;
            case 23:
                NonAbundantSums.run();      // problem 23
                break;
            case 25:
                BigFibonacci.run();         // problem 25
                break;
            case 26:
	            ReciprocalCycles.run();     // problem 26
                break;
            case 67:
                PathSumLarge.run(); 		// problem 67
                break;
            default:
                programIncomplete( arg1 );
                break;
        }

		long endTime = System.currentTimeMillis(); // Time end
		
        System.out.println("\n" + (endTime - startTime)
				+ " ms taken to complete calculations.");
	}

    private static void programIncomplete( int problem ) {
        
        System.out.println( "Problem " + problem + " is not yet complete." );
        
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
