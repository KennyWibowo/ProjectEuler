
package main;
import static java.lang.System.out;

import pset.as_nineteen.CountingSundays;
import pset.co_sixtyseven.PathSumLarge;

public class Main {
	public static void main(String[] args) {
		long startTime = System.nanoTime();      //Time start
//		ThreeFiveSum.run();			//problem 1
//		Fibonacchi.run();			//problem 2
//		PrimeFactor.run();			//problem 3
//		Palindrome.run();			//problem 4
//		SmallestMultiple.run();		//problem 5
//		SumsAndSquares.run();		//problem 6
//		MorePrimes.run();			//problem 7
//		ProductSeries.run();		//problem 8
//		PythagTriple.run();			//problem 9
//		PrimeSum.run();				//problem 10
//		GridProduct.run();			//problem 11
//		TriangNum.run();			//problem 12
//		LargeSum.run();				//problem 13
//		NumberLetters.run();		//problem 17
//		PathSum.run();				//problem 18
		CountingSundays.run();		//problem 19
//		PathSumLarge.run();			//problem 67
		long endTime = System.nanoTime();        //Time end
		timer(startTime, endTime);
	}
	private static void timer(long start, long finish){
		long timeTaken = finish - start;
		String timeFormatted = "0.";
		int count = String.valueOf(timeTaken).length();
		for(int i = 9-count; i>0; i--)
			timeFormatted += "0";
		timeFormatted += String.valueOf(timeTaken);
		out.println("\n" + timeFormatted + " seconds taken to complete calculations.");
	}
}
