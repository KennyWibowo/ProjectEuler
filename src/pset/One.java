package pset;


public class One {
    
    private static final int NUM_PROBLEM = 1;
    
    private static final int NUM_1 = 3;
    private static final int NUM_2 = 5;
    private static final int NUM_3 = NUM_1*NUM_2;
    private static final int MAX = 1000;
    
    public static void run() {
        int sum = 0;
        
        // creates upper limits so that each iteration of the loop
        // does not have to, for optimization
        int lim1 = roundUp(MAX , NUM_1);
        int lim2 = roundUp(MAX , NUM_2);
        int lim3 = roundUp(MAX , NUM_3);
        
        // adds the total sums of 3 and 5
        for (int i = 0; i < lim1; i++)
            sum += NUM_1 * i;
            
        for (int i = 0; i < lim2; i++)
            sum += NUM_2 * i;
        
        // removes the overlap of 3*5
        for (int i = 0; i < lim3; i++)
            sum -= NUM_3 * i;
            
        System.out.println("Problem " + NUM_PROBLEM + ": The sum is: " + sum);
    }
    
    // calculates a/b and returns the rounded up result.
    private static int roundUp(int a, int b) {
        int result = a/b;
        
        // increments result in order to round up.
        if(a%b != 0)
            result++;
        
        return result;
    }

}
