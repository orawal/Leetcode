package easy;

import org.junit.Assert;
import org.junit.Test;

public class RobotReturnTests {
    RobotReturn robotReturn = new RobotReturn();

    @Test
    public void testCase1() {
        boolean actual = robotReturn.judgeCircle( "UD" );
        Assert.assertTrue( actual );
    }

    @Test
    public void testCase2() {
        boolean actual = robotReturn.judgeCircle( "LL" );
        Assert.assertFalse( actual );
    }
}
