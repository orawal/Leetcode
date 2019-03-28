package easy;

// Leetcode Question: 832
// https://leetcode.com/problems/flipping-an-image/
public class FlippingImage {
    public int[][] flipAndInvertImage(int[][] A) {
        int len = A[0].length;
        for ( int[] row: A ) {
            for ( int col = 0; col < ( len + 1) / 2; col++ ) {
                int tmp = row[col] ^ 1;
                row[col] = row[len - 1 - col] ^ 1;
                row[len - 1 - col] = tmp;
            }
        }
        return A;
    }
}
