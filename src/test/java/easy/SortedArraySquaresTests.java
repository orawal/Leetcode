package easy;

import org.junit.Assert;
import org.junit.Test;

public class SortedArraySquaresTests {
    SortedArraySquares sortedArraySquares = new SortedArraySquares();

    @Test
    public void testCase1() {
        int[] actual = sortedArraySquares.sortedSquares( new int[]{-4,-1,0,3,10} );
        int[] expected = {0,1,9,16,100};
        Assert.assertArrayEquals( expected, actual );
    }

    @Test
    public void testCase2() {
        int[] actual = sortedArraySquares.sortedSquares( new int[]{-7,-3,2,3,11} );
        int[] expected = {4,9,9,49,121};
        Assert.assertArrayEquals( expected, actual );
    }
}
