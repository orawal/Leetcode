package easy;

import java.util.Arrays;

// Leetcode Question: 905
// https://leetcode.com/problems/sort-array-by-parity/
public class ParitySortArray {
    public int[] sortArrayByParity(int[] A) {
        int len = A.length;
        int even = 0;
        int odd = len - 1;
        int[] sortedArray = new int[len];
        for (int x : A) {
            sortedArray[x % 2 == 0 ? even++ : odd--] = x;
        }
        return sortedArray;
    }
}
