package pset.al_twelve;
import static java.lang.System.out;
import java.util.ArrayList;


public class TriangNum {
	public static void run(){
		long current = 1;
		long triang = 0;
		long divisor = 500;
		boolean notfound = true;
		while(notfound){
			triang = 0;
			for(int i = 1; i<=current; i++){
				triang+=i;
			}
			if(factorNum(triang)<divisor){
				current++;
			}else{
				notfound = false;
			}
		}
		out.println("The " + current + "th triangular number with a value of " + triang + " has over " + divisor + " divisors.");
	}
	private static long factorNum(long num){
		long factors = 0;
		
		for(long i=1; i < num/2; i++)
			if(num%i==0)
				factors++;
		
		factors++;
		return factors;
	}
}
