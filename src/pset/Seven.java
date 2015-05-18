package pset;
import static java.lang.System.out;

public class Seven {
	public static void run(){
		long prime = 2;
		for(int i = 1; i<=10001; i++){

			while(isNotPrime(prime)){
				prime++;
			}
			prime++;
		}
		out.println("Problem 7: " + prime + " is the 10001th prime number.");

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
