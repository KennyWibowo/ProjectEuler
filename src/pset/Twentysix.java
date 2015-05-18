package pset;

import static java.lang.System.out;

import java.math.BigDecimal;

public class Twentysix {
	public static void run() {
		int mostRepeats = 0;
//		for(int i=1; i<1000; i++){
//			try{
//				BigDecimal.ONE.divide(new BigDecimal(i));
//
//			}catch(Exception e){
//				getRepeatingDecimal(i);
//			}
//		}
		
		out.println("Problem 26: " + getRepeatingDecimal(12));
	}
	private static int getRepeatingDecimal(int input){
		int repetition = 0;
		int numerator = 7;
		while(numerator<input){
			numerator*=10;
		}
		
		do{
			numerator %= input;
			numerator *= 10;
			repetition++;
			out.println(numerator);
		}while(numerator != 0 && numerator != 40);
		
		return repetition;
	}
}