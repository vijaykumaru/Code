package strings;

// Most efficient Java program to count all
// substrings with same first and last characters.

public class GFGWithDuplicates {
    // assuming lower case only
    static final int MAX_CHAR = 52;

    static int countSubstringWithEqualEnds(String s)
    {
        int result = 0;
        int n = s.length();

        // Calculating frequency of each character
        // in the string.
        int[] count =  new int[MAX_CHAR];
        for (int i = 0; i < n; i++)
            count[s.charAt(i)-'A']++;

        // Computing result using counts
        for (int i = 0; i < MAX_CHAR; i++)
            result += (count[i] * (count[i] + 1) / 2);

        return result;
    }

    // Driver function
    public static void main(String args[])
    {
        String s = "abcabCD";
        System.out.println(countSubstringWithEqualEnds(s));
    }
}
// This code is contributed by Sumit Ghosh

