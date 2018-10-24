package chapter1.Q1_05_One_Away;

/**
 * Created by harry on 24/10/2018.
 */

public class QuestionA {
    public static boolean checkReplace(String s1, String s2) {
        boolean foundDifference = false;

        for(int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                if(foundDifference) {
                    return false;
                }

                foundDifference = true;
            }
        }

        return true;
    }

    public static boolean checkRemove(String s1, String s2) {
        int differences = 0;

        for(int i = 0; i < s2.length(); i++) {
            if(s1.charAt(i + differences) != s2.charAt(i)) {
                differences++;
                i--;
                if(differences > 1) {
                    return false;
                }

            }
        }

        return true;
    }

    public static boolean isOneAway(String s1, String s2) {
        if(s1.length() == s2.length()) {
            return checkReplace(s1, s2);
        }

        if(s1.length() - s2.length() == 1) {
            return checkRemove(s1, s2);
        }

        if(s1.length() - s2.length() == -1) {
            return checkRemove(s2, s1);
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isOneAway("pale", "ple"));
        System.out.println(isOneAway("pales", "pale"));
        System.out.println(isOneAway("pale", "bale"));
        System.out.println(isOneAway("pale", "bake"));
    }
}
