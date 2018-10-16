package chapter1.Q1_02_CheckPermutation;

import java.util.Arrays;

/**
 * Created by harry on 13/10/2018.
 */

public class Exercise1 {
    public static String sort(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static boolean isPermutation(String a, String b) {
        return sort(a).equals(sort(b));
    }

    public static void main(String[] args) {

    }
}
