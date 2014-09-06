package pset.ag_seven;
import static java.lang.System.out;

public class MorePrimes {
	public static void run(){
		long prime = 2;
		for(int i = 1; i<=10001; i++){

			while(isNotPrime(prime)){
				prime++;
			}
			out.println(prime + " is the " + i +"th prime number.");
			prime++;
		}

	}
	public static boolean isNotPrime(long n){
		for(int j=2;j<=Math.sqrt(n);j++){
			if(n%j ==0){
				return true;
			}
		}
		return false;

	}
}
