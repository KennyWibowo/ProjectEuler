package pset;
import java.util.*;

public class Twentyfour {
	
	private static final int NUM_PROBLEM = 24;
	private static final int digits[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}

	public static void run() {
        ArrayList<Integer> perms = 
		System.out.println("Problem " + NUM_PROBLEM + ": " + perms.get(999999));
	}

    // TODO
    private static ArrayList<Integer> createLPerm (int[] digits, int ) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int upperLim = factorial( digits.length );

        while(
    }

    private static int factorial( int input ) {
        if( input < 2 )
            return 1;
        
        return input * factorial( input - 1 );
    }
	
}
