package main;


public class BalancedBrackets {
    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {
        char [] chars = str.toCharArray();
        if (chars.length == 0) {
            throw new IllegalArgumentException("Empty strings do not have brackets.");
        }

        if (!str.contains("[") && !str.contains("]")) {
            return false;
        }

        int brackets = 0;
        int openingBracket = 0;
        int closingBracket = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '[') {
                brackets++;
                openingBracket++;
            } else if (ch == ']') {
                brackets--;
                closingBracket++;
                if (openingBracket == 0) {
                    throw new IllegalArgumentException("Mis-nesting brackets have been detected.");
                }
                if (brackets < 0) {
                    throw new IllegalArgumentException("Mis-nesting brackets have been detected.");
                }
            }
        }

        return brackets == 0;
    }
}
