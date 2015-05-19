package pset;

import static java.lang.System.out;

import java.util.ArrayList;

public class Four {

    public static void run() {
        String temp = "";
        ArrayList<Integer> palindromes = new ArrayList<Integer>();
        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {
                temp = String.valueOf(i * j);
                if (temp.length() % 2 == 0) {
                    if (isPalindrome(temp)) {
                        palindromes.add(Integer.parseInt(temp));
                    }
                } else {
                    String tempo = removeMid(temp);
                    if (isPalindrome(tempo)) {
                        palindromes.add(Integer.parseInt(temp));
                    }
                }
            }
        }
//      out.println("Problem 4: Number of palindromes: " + palindromes.size());
        out.println("Problem 4: Largest palindrome: " + getLargest(palindromes));
    }

    private static boolean isPalindrome(String input) {
        // precondition: input is an even length
        int front = 0;
        int back = input.length() - 1;
        int count = input.length() / 2;
        boolean pal = true;
        while (count != 0) {
            if (input.charAt(front) != input.charAt(back)) {
                pal = false;
            }
            front++;
            back--;
            count--;
        }
        return pal;
    }

    private static String removeMid(String input) {
        // preconditon: input is an odd length
        String output = input.substring(0, input.length() / 2)
                + input.substring((input.length() + 1) / 2, input.length() - 1);
        return output;
    }

    private static int getLargest(ArrayList<Integer> arr) {
        int temp = 0;
        for (int i = 0; i < arr.size(); i++)
            if (arr.get(i) > temp)
                temp = arr.get(i);
        return temp;
    }
}
