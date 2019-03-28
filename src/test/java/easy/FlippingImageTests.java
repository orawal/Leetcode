package easy;

import org.junit.Assert;
import org.junit.Test;

public class FlippingImageTests {
    FlippingImage flippingImage = new FlippingImage();

    @Test
    public void testCase1() {
        int[][] actual = flippingImage.flipAndInvertImage( new int[][]{{1,1,0}, {1,0,1}, {0,0,0}});
        int[][] expected = {{1,0,0}, {0,1,0}, {1,1,1}};
        Assert.assertArrayEquals( expected, actual );
    }

    @Test
    public void testCase2() {
        int[][] actual = flippingImage.flipAndInvertImage( new int[][]{{1,1,0,0}, {1,0,0,1}, {0,1,1,1}, {1,0,1,0}});
        int[][] expected = {{1,1,0,0},{0,1,1,0},{0,0,0,1},{1,0,1,0}};
        Assert.assertArrayEquals( expected, actual );
    }
}
