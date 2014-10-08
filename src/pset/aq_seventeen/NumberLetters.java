package pset.aq_seventeen;

import static java.lang.System.out;

public class NumberLetters {

	public static void run() {
		int sum = 0;
		for (int i = 1; i <= 1000; i++)
			sum += toEnglish(i).length();
		out.println("Problem 17: The sum of the characters of the numbers is " + sum);
	}
	
	
	private static String[] uno = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	private static String[] diez = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	private static String[] veinte = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
	
	
	private static String toEnglish(int n) {	
		if (n < 100)
			return tens(n);
		else {
			String big = "";
			if (n >= 1000)
				big += tens(n / 1000) + "thousand";
			if (n / 100 % 10 != 0)
				big += uno[n / 100 % 10] + "hundred";
			
			return big + (n % 100 != 0 ? "and" + tens(n % 100) : "");
		}
	}
	
	
	private static String tens(int n) {
		if (n < 10)
			return uno[n];
		else if (n < 20)
			return diez[n - 10];
		else
			return veinte[n / 10 - 2] + (n % 10 != 0 ? uno[n % 10] : "");
	}
}
