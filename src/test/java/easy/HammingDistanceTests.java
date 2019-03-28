package easy;

import org.junit.Assert;
import org.junit.Test;

public class HammingDistanceTests {
    HammingDistance hammingDistance = new HammingDistance();

    @Test
    public void testCase() {
        int actual = hammingDistance.hammingDistance( 1, 4 );
        int expected = 2;
        Assert.assertEquals( expected, actual );
    }
}
