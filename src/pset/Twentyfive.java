package pset;
import static java.lang.System.out;
import java.math.BigInteger;

public class Twentyfive {
    
    public static void run(){
        BigInteger x = new BigInteger("1");
        BigInteger y = new BigInteger("0");
        int term = 0;
        while(y.toString().length() < 1000){
            BigInteger temp = y;
            y = y.add(x);
            x = temp;
            out.println(y);
            out.println(" " + y.toString().length());
            term++;
        }
        out.println("Problem 25: The first fibonacci term with 1000 digits is " + term);
    }
}
