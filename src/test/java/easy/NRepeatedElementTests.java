package easy;

import org.junit.Assert;
import org.junit.Test;

public class NRepeatedElementTests {
    NRepeatedElement nRepeatedElement = new NRepeatedElement();

    @Test
    public void testCase1() {
        int actual = nRepeatedElement.repeatedNTimes( new int[]{1,2,3,3} );
        int expected = 3;
        Assert.assertEquals( expected, actual );
    }

    @Test
    public void testCase2() {
        int actual = nRepeatedElement.repeatedNTimes( new int[]{2,1,2,5,3,2} );
        int expected = 2;
        Assert.assertEquals( expected, actual );
    }

    @Test
    public void testCase3() {
        int actual = nRepeatedElement.repeatedNTimes( new int[]{5,1,5,2,5,3,5,4} );
        int expected = 5;
        Assert.assertEquals( expected, actual );
    }
}
