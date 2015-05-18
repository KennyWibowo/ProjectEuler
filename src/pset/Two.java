package pset;

public class Two {
    
    private static final int NUM_PROBLEM = 2;
    private static final int UPPER_LIM = 4000000;

	public static void run(){
		int sum = 0;
		int x = 1;
		int y = 2;

		while( x < UPPER_LIM ){
			
            int temp=y;
			y=x+y;
			x=temp;

			if( isEven( x ) )
				sum+=x;

		}

		System.out.println("Problem " + NUM_PROBLEM + ": The sum is: " + sum);
	}

    private static boolean isEven( int num ) {
        if( num%2 == 0 )
            return true;

        return false;
    }
}
