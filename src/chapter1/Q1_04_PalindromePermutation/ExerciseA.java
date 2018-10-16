package chapter1.Q1_04_PalindromePermutation;

/**
 * Created by harry on 15/10/2018.
 */

public class ExerciseA {
    public static boolean palindromePermutation(String s) {
        int countNotEven = 0;
        int[] letters = new int[128];

        for(char ch : s.toCharArray()) {
            if(ch == ' ') continue;

            letters[ch]++;

            if(letters[ch] % 2 == 0) {
                countNotEven--;
            }
            else {
                countNotEven++;
            }
        }

        return countNotEven <= 1;
    }

    public static void main(String[] args) {
        System.out.println(palindromePermutation("mpampis"));
    }
}
