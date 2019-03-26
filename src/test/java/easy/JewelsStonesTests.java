package easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class JewelsStonesTests {
    JewelsStones jewelsStones;

    @Before
    public void before() {
        jewelsStones = new JewelsStones();
    }
    @Test
    public void validTestCase1() {
        int actual = jewelsStones.numJewelsInStones( "aA", "aAAbbbb" );
        int expected = 3;
        Assert.assertEquals( expected, actual );
    }

    @Test
    public void validTestCase2() {
        int actual = jewelsStones.numJewelsInStones( "z", "ZZ" );
        int expected = 0;
        Assert.assertEquals( expected, actual );
    }

    @Test
    public void invalidTestCase1() {
        int actual = jewelsStones.numJewelsInStones( null, null);
        int expected = 0;
        Assert.assertEquals( expected, actual );
    }

    @Test
    public void invalidTestCase2() {
        int actual = jewelsStones.numJewelsInStones( "", "");
        int expected = 0;
        Assert.assertEquals( expected, actual );
    }
}