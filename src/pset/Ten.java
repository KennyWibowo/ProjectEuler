package pset;

import static java.lang.System.out;

public class Ten {
    public static void run() {
        long sum = 0;
        for (int i = 2; i < 2000000; i++)
            if (isPrime(i))
                sum += i;

        out.println("Problem 10: The sum of all prime numbers below 2000000 is: "
                + sum);
    }

    private static boolean isPrime(long n) {
        for (int j = 2; j <= Math.sqrt(n); j++)
            if (0 == n % j)
                return false;

        return true;

    }
}
