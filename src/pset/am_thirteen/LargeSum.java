package pset.am_thirteen;

import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LargeSum {
	public static void run() {
		String longNumber = readfromFile("problemthirteen.txt");
		long tenDigits = 0;
		String tenOfThem = "";
		for (int i = 0; i < longNumber.length() / 50; i++) {
			// if(tenOfThem.length()<12){
			tenDigits += Long.parseLong(longNumber.substring(i * 50 + 40,
					(i * 50) + 50));
			// out.println(tenOfThem);
			tenOfThem = String.valueOf(tenDigits);
			// }else{
			// tenOfThem = tenOfThem.substring(1,11);
			// out.println(tenOfThem);
			// tenDigits = Long.parseLong(tenOfThem);
			// tenDigits+=longNumber.charAt(i);
			// }

		}
		// tenOfThem = tenOfThem.substring(1,10);
		out.println("The first ten digits are: " + tenOfThem);
	}

	public static String readfromFile(String filename) {
		BufferedReader br = null;
		String file = "";
		try {
			String line;
			br = new BufferedReader(new FileReader(filename));
			while ((line = br.readLine()) != null) {
				file += line;
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
