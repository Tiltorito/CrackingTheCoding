package chapter1.Q1_01_Is_Unique;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by harry on 13/10/2018.
 */

public class Exercise1 {
    public static boolean isUnique(String s) {
        int[] occurrences = new int[128];

        for(char ch : s.toCharArray()) {
            occurrences[ch]--;
            if(occurrences[ch] < -1) {
                return false;
            }
        }

        return true;
    }

    public static boolean isUniqueb(String s) {
        Map<Character, Boolean> map = new HashMap<>();
        for(char ch : s.toCharArray()) {
            if(map.containsKey(ch)) {
                return false;
            }

            map.put(ch, true);
        }

        return true;
    }

    public static void main(String[] args) {

    }
}
