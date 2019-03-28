package easy;

import java.util.Arrays;

public class SortedArraySquares {
    public int[] sortedSquares(int[] A) {
        for ( int i = 0; i < A.length; i++ ) {
            A[i] *= A[i];
        }
        Arrays.sort( A );
        return A;
    }
}
