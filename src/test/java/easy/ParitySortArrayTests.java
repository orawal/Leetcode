package easy;

import org.junit.Assert;
import org.junit.Test;

public class ParitySortArrayTests {
    ParitySortArray paritySortArray = new ParitySortArray();

    @Test
    public void testCase() {
        int[] actual = paritySortArray.sortArrayByParity( new int[]{3,1,2,4} );
        int[] expected = {2,4,1,3};
        Assert.assertArrayEquals( expected, actual );
    }
}
