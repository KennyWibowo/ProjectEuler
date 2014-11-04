package pset.az_twentysix;
import static java.lang.System.out;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ReciprocalCycles {
	public static void run(){

		out.println(repetition(3));
	}
	private static int repetition(int input){
		BigDecimal testRepeat = BigDecimal.ONE;
		try{
			testRepeat.divide(new BigDecimal(input));
		}catch(ArithmeticException e){
			ArrayList<Integer> arr = new ArrayList<Integer>();
			arr.add(10/input);
			int remainder = 10%input;
			int place = 0;
			boolean isRepeating = true;
			
			while(isRepeating || remainder%input == 0){
				remainder*=10;
				arr.add(remainder%input);
				
				if(arr.size()%2 == 0 && arr.get(0)==arr.get(arr.size()-1)){
					isRepeating = false;
					for(int i=0; i<arr.size()/2;i++){
						if(arr.get(i) != arr.get(i + arr.size()/2)){
							isRepeating = true;
						}
					}
				}
					
			}
			//basically, trying to get to 0.33 if input is 3, then comparing the 3 and 3 to see if it repeats. if it is, horray, but if its not, keep going.
			//this is probably really inefficient, consider redoing algorithm altogether
			return arr.size()/2;

		}
		
		return -1;
	}

}