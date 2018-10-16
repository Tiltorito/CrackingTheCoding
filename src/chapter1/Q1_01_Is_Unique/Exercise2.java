package chapter1.Q1_01_Is_Unique;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by harry on 13/10/2018.
 */

public class Exercise2 {
    public static boolean isUnique(String s) {
        int checker = 0;

        for(char ch : s.toCharArray()) {
            int val = ch - 'a';
            if((checker & (1 << val)) > 0) return false;

            checker |= (1 << val);
        }

        return true;
    }

    public static void main(String[] args) {

    }
}
