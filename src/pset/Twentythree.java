package pset;

import static java.lang.System.out;

import java.util.ArrayList;

public class Twentythree {
    public static void run() {
        ArrayList<Integer> abundance = new ArrayList<Integer>();
        boolean[] abundancy = new boolean[28124];
        int sum = 0;

        for (int i = 1; i < 28123; i++) {
            if (isAbundant(i))
                abundance.add(i);
        }

        for (int i = 0; i < abundance.size(); i++) {
            for (int j = i; j < abundance.size(); j++) {
                if (abundance.get(i) + abundance.get(j) <= 28123) {
                    abundancy[abundance.get(i) + abundance.get(j)] = true;
                } else {
                    break;
                }
            }
        }

        for (int i = 0; i < abundancy.length; i++)
            if(!abundancy[i])
                sum += i;

            
        out.println("Problem 23: The sum of these numbers is " + sum);
    }

    private static boolean isAbundant(int input) {
        int sum = 0;
        for (int i = 1; i < input; i++)
            if (input % i == 0) 
                sum += i;
            
        if (sum > input) 
            return true;
        
        return false;
    }
}
