package chapter1.Q1_06_String_Compression;

/**
 * Created by harry on 25/10/2018.
 */

public class QuestionA {

    public static int countOccuranciesInRow(char[] str, char ch, int startIndex) {
        int ctr = 0;

        for(int i = startIndex; i < str.length; i++) {
            if(str[i] == ch) {
                ctr++;
            }
            else {
                return ctr;
            }
        }

        return ctr;
    }

    public static String compress(String s) {
        StringBuilder compressed = new StringBuilder();
        char[] str = s.toCharArray();

        for(int i = 0; i < s.length(); i++) {
            compressed.append(s.charAt(i));

            int occurancies = countOccuranciesInRow(str, s.charAt(i), i + 1);

            compressed.append(occurancies + 1);

            i += occurancies;
        }

        return compressed.length()  < s.length() ? compressed.toString() : s;
    }

    public static void main(String[] args) {
        System.out.println(compress("abcd"));
    }
}
