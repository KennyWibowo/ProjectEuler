package pset.af_six;
import static java.lang.System.out;

public class SumsAndSquares {
	public static void run(){
		long sumsquare = 0;
		long squaresum = 0;
		for(int i=1; i<=100; i++)
			sumsquare += Math.pow(i,2);
		for(int i=1; i<=100; i++)
			squaresum += i;
		squaresum = (long) Math.pow(squaresum, 2);
		out.println("Problem 6: "+ squaresum + " - " + sumsquare + " = " + (squaresum-sumsquare));
	}
}
