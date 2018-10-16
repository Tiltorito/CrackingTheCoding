package chapter1.Q1_02_CheckPermutation;

/**
 * Created by harry on 13/10/2018.
 */

public class Exercise2 {
    public static boolean isPermutation(String a, String b) {
        if(a.length() != b.length()) {
            return false;
        }

        int[] chars = new int[128];

        for(char ch : a.toCharArray()) {
            chars[ch]++;
        }

        for(char ch : b.toCharArray()) {
            chars[ch]--;
            if(chars[ch] < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

    }
}
