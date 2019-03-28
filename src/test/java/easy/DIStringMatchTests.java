package easy;

import org.junit.Assert;
import org.junit.Test;

public class DIStringMatchTests {
    DIStringMatch diStringMatch = new DIStringMatch();

    @Test
    public void testCase1() {
        int[] actual = diStringMatch.diStringMatch( "IDID" );
        int[] expected = {0,4,1,3,2};
        Assert.assertArrayEquals( expected, actual );
    }

    @Test
    public void testCase2() {
        int[] actual = diStringMatch.diStringMatch( "III" );
        int[] expected = {0,1,2,3};
        Assert.assertArrayEquals( expected, actual );
    }

    @Test
    public void testCase3() {
        int[] actual = diStringMatch.diStringMatch( "DDI" );
        int[] expected = {3,2,0,1};
        Assert.assertArrayEquals( expected, actual );
    }
}
