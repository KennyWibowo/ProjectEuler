package pset;
import java.util.*;

public class Twentyfour {
	
	private static final int NUM_PROBLEM = 24;
	private static final String digits = "0123456789";
    
	public static void run() {
        ArrayList<String> perms = new ArrayList<String>();
        permutation( "", digits, perms );
        Collections.sort( perms );
		System.out.println("Problem " + NUM_PROBLEM + ": " + perms.get(999999));
	}

    private static void permutation( String prefix, String str, 
                                        ArrayList<String> perms ) {
        int n = str.length();

        // base case, input string is done parsing
        if (n == 0) { 
            perms.add( prefix );

        // recursive case, still more input to parse through
        } else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), 
                            str.substring(0, i) + str.substring(i+1),
                            perms);
        }

    }

}
