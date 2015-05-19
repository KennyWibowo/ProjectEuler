package pset;
import static java.lang.System.out;

public class Nine {
    public static void run(){
        int c = 0;
        int sum = 1000;
        for(int a=1; a<=sum/3; a++)
            for(int b=a+1; b<=sum/2; b++){
                c = sum - (a + b);
                if ( c > 0 && (a*a + b*b == c*c) )
                       out.printf("Problem 9: a = %d, b = %d, c = %d, a*b*c = %d\n",a,b,c, a*b*c); //formatted cuz it's easier to print
            }
            
    }
}
