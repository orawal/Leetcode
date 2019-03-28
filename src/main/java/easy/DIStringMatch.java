package easy;

import java.util.Arrays;
import java.util.stream.IntStream;

// Leetcode Question: 942
// https://leetcode.com/problems/di-string-match/
public class DIStringMatch {
    public int[] diStringMatch(String S) {
        int len = S.length();
        int index = 0;
        int start = 0;
        int end = len;
        int[] result = new int[len + 1];

            for ( char c: S.toCharArray() ) {
                if ( c == 'I') {
                    result[index] = start;
                    start++;
                } else if ( c == 'D' ) {
                    result[index] = end;
                    end--;
                }
                index++;
            }
            result[index] = start;
        return result;
    }
}
