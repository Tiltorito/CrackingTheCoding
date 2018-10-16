package chapter1.Q1_03_URLify;

import java.util.stream.Stream;

/**
 * Created by harry on 13/10/2018.
 */

public class Exercise1 {
    public static String urlify(char[] s, int trueLength) {
        int spaces = 0;

        for(int i = 0; i < trueLength; i++) {
            if(s[i] == ' ') spaces++;
        }

        for(int i = s.length - 1; i >= 0; i--) {
            int j = i - spaces * 2;

            if(s[j] == ' ') {
                s[i] = '0';
                s[i - 1] = '2';
                s[i - 2] = '%';
                i = i - 2;
                spaces--;
                if(spaces == 0) break;
            }
            else {
                s[i] = s[j];
            }
        }

        return new String(s);
    }

    public static void main(String[] args) {
        String s = "Mr John Smith    ";
        System.out.println(s.length());
        System.out.println(urlify(s.toCharArray(), 13));
    }
}
