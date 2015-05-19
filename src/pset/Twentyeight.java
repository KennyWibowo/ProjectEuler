package pset;

public class Twentyeight {
    
    private static final int NUM_PROBLEM = 28;
    
    public static void run() {
        System.out.println("Problem " + NUM_PROBLEM + ": " + getCornerSum(1001) );
    }

    public static int getCornerSum( int sidelen ) {

        // Starts at 1, since the center is the only square that doesn't have 4 numbers
        // for corners.
        int totalSum = 1;
        int currNum = 1;

        // if it's even, not a 
        if( sidelen%2 == 0 ) {
            System.out.println("Error: Invalid length of side.");
            return -1;
        }

        // Iterates through all sides, starting with 3.
        for( int i = 3; i <= sidelen; i+=2 ) {
            // four corners per side, iterate four times.
            for(int j = 0; j < 4; j++ ) {
                currNum += (i - 1);
                totalSum += currNum;
            }
        }

        return totalSum;
    }
    
}
