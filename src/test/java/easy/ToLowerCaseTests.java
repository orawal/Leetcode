package easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ToLowerCaseTests {
    ToLowerCase toLowerCase;

    @Before
    public void before() {
        toLowerCase = new ToLowerCase();
    }

    @Test
    public void testCase1() {
        String actual = toLowerCase.toLowerCase( "Hello" );
        String expected = "hello";
        Assert.assertEquals( expected, actual );
    }

    @Test
    public void testCase2() {
        String actual = toLowerCase.toLowerCase( "here" );
        String expected = "here";
        Assert.assertEquals( expected, actual );
    }

    @Test
    public void testCase3() {
        String actual = toLowerCase.toLowerCase( "LOVELY" );
        String expected = "lovely";
        Assert.assertEquals( expected, actual );
    }

    @Test
    public void testCase4() {
        String actual = toLowerCase.toLowerCase( "al&phaBET" );
        String expected = "al&phabet";
        Assert.assertEquals( expected, actual );
    }
}
