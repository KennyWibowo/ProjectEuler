package pset;

import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;

public class Thirteen {
    public static void run() {
        BigInteger sum = new BigInteger("0");
        ArrayList<String> file = readfromFile("problemthirteen.txt");
        for (int i = 0; i < file.size(); i++) {
            sum = sum.add(new BigInteger(file.get(i)));
        }
        String output = sum.toString();
        out.println("Problem 13: The first ten digits of the sum are: " + output.substring(0,10));
    }

    private static ArrayList<String> readfromFile(String filename) {
        BufferedReader br = null;
        ArrayList<String> file = new ArrayList<String>();
        try {
            String line;
            br = new BufferedReader(new FileReader(filename));
            while ((line = br.readLine()) != null) {
                file.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return file;
    }
}
