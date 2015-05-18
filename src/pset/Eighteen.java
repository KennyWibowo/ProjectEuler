package pset;

import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Eighteen {

	public static void run() {
		ArrayList<ArrayList<Integer>> tempPaths = readfromFile("problemeighteen.txt");
		int[][] paths = new int[tempPaths.get(tempPaths.size() - 1).size()][tempPaths
				.size()];
		for (int i = 0; i < tempPaths.size(); i++)
			for (int j = 0; j < tempPaths.get(i).size(); j++)
				paths[i][j] = tempPaths.get(i).get(j);

		for (int i = paths.length - 2; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				paths[i][j] += Math.max(paths[i + 1][j], paths[i + 1][j + 1]);
			}
		}

		out.println("Problem 18: The sum of the maximum total from top to bottom is "
				+ paths[0][0]);

	}

	private static ArrayList<ArrayList<Integer>> readfromFile(String filename) {
		BufferedReader br = null;
		ArrayList<ArrayList<Integer>> file = new ArrayList<ArrayList<Integer>>();
		try {
			String line;
			br = new BufferedReader(new FileReader(filename));
			while ((line = br.readLine()) != null) {
				String[] tokensA = line.split(" ");
				ArrayList<Integer> tokens = new ArrayList<Integer>();
				for (int i = 0; i < tokensA.length; i++) {
					if (tokensA[i].charAt(0) == '0') { // removes 0 at front so
														// that it's not
														// mistaken as octal
						tokens.add(Integer.parseInt(String.valueOf(tokensA[i]
								.charAt(1))));
					} else {
						tokens.add(Integer.parseInt(tokensA[i]));
					}

				}
				file.add(tokens);
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
