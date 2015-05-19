package main;

import static java.lang.System.out;
import pset.*;

public class Main {
    public static void main(String[] args) {

        if ( args.length != 1 ) {
            System.out.println( 
                    "Error: need 1 param to specify problem number " );
            System.exit( -1 );
        }
        
        int arg1;
        
        try {
            arg1 = Integer.parseInt( args[0] );
        } catch ( NumberFormatException e ) {
            arg1 = -1;    
        }

        if ( arg1 < 1 ) {
            System.out.println(
                    "Error: invalid problem number" );
            System.exit( -1 );
        }

        long startTime = System.currentTimeMillis(); // Time start

        switch ( arg1 ) {
            case 1:
                One.run();          // problem 1
                break;
            case 2:
                Two.run();          // problem 2
                break;
            case 3:
                Three.run();        // problem 3
                break;
            case 4:
                Four.run();         // problem 4
                break;
            case 5:
                Five.run();         // problem 5
                break;
            case 6:
                Six.run();          // problem 6
                break;
            case 7:
                Seven.run();        // problem 7
                break;
            case 8:
                Eight.run();        // problem 8
                break;
            case 9:
                Nine.run();         // problem 9
                break;
            case 10:
                Ten.run();          // problem 10
                break;
            case 11:
                Eleven.run();       // problem 11 
                break;
            case 12:
                Twelve.run();       // problem 12
                break;
            case 13:
                Thirteen.run();     // problem 13
                break;
            case 16:
                Sixteen.run();      // problem 16
                break;
            case 17:
                Seventeen.run();    // problem 17
                break;
            case 18:
                Eighteen.run();     // problem 18
                break;
            case 19:
                Nineteen.run();     // problem 19
                break;
            case 20:
                Twenty.run();       // problem 20
                break;
            case 21:
                Twentyone.run();    // problem 21
                break;
            case 22:
                Twentytwo.run();    // problem 22
                break;
            case 23:
                Twentythree.run();  // problem 23
                break;
            case 24:
                Twentyfour.run();   // problem 24
                break;
            case 25:
                Twentyfive.run();   // problem 25
                break;
            case 26:
                Twentysix.run();    // problem 26
                break;
            case 28:
                Twentyeight.run();
                break;
            case 67:
                Sixtyseven.run();   // problem 67
                break;
            default:
                programIncomplete( arg1 ); // if program is not yet, display message.
        }

        long endTime = System.currentTimeMillis(); // Time end
        
        System.out.println("\n" + (endTime - startTime)
                + " ms taken to complete calculations.");
    }

    private static void programIncomplete( int problem ) {
        
        System.out.println( "Problem " + problem + " is not yet complete or does not exist." );
        
    }

    // Deprecated, takes in different System.nanoTime() readings and
    // prints time taken in seconds.
    private static void timer(long start, long finish) {

        long timeTaken = finish - start;
        String timeFormatted = "0.";
        int count = String.valueOf(timeTaken).length();
        for (int i = 9 - count; i > 0; i--)
            timeFormatted += "0";
        timeFormatted += String.valueOf(timeTaken);
        out.println("\n" + timeFormatted
                + " ms taken to complete calculations.");

    }
}
