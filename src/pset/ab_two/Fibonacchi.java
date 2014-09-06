package pset.ab_two;
import static java.lang.System.out;

public class Fibonacchi {
	public static void run(){
		int sum = 0;
		int x = 1;
		int y = 2;
		while(x<4000000){
			int temp=y;
			y=x+y;
			x=temp;
			if(x%2==0){
				sum+=x;
			}
		}
		out.println("Problem 2: The sum is: " + sum);
	}
}
