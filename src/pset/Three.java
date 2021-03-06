package pset;
import static java.lang.System.out;

import java.util.ArrayList;

public class Three {
    public static void run(){
        long num = 600851475143L;
        ArrayList<Long> primes = new ArrayList<Long>();
        for (long i = 2; i <= num; i++) {
            while (num % i == 0) {
                primes.add(i);
                num /= i;
            }
        }
        out.print("Problem 3: The primes of the given big number are:");
        for(int i=0; i<primes.size(); i++)
            out.print(" " + primes.get(i));
        out.println();
    }
}
