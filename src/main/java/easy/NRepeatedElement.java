package easy;


// Leetcode Question: 961
// https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
public class NRepeatedElement {
    public int repeatedNTimes(int[] A) {
        int[] cnt = new int[10000];
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            if(++cnt[A[i]] > 1) {
                result = A[i];
                break;
            }
        }
        return result;
    }
}
