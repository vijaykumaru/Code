package strings;

import java.util.*;

// Java program to count all substrings with same
// first and last characters.
public class GFG {

    // Returns true if first and last characters
    // of s are same.
    static boolean checkEquality(String s)
    {
        return (s.charAt(0) == s.charAt(s.length() - 1));
    }
    static Set<String> substrEqualEnds = new LinkedHashSet<String>();
    static int result = 0;

    static int countSubstringWithEqualEnds(String s)
    {
        int n = s.length();
        // Starting point of substring
        for (int i = 0; i < n; i++)

            // Length of substring
            for (int len = 1; len <= n-i; len++) {
                // Check if current substring has same
                // starting and ending characters.
                String str = s.substring(i, i + len);
                if (checkEquality(str)) {
                    substrEqualEnds.add(str);
                    result++;
                }
            }
        return result;
    }

    // Driver function
    public static void main(String args[])
    {
        String s = "abcab";
        System.out.println("Number of Strings with Equal ends: "+countSubstringWithEqualEnds(s));
        System.out.println("Strings without duplicates: ");
        for (String str:substrEqualEnds) {
            System.out.println(str);
        }
    }
}

