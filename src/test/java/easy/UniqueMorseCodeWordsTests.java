package easy;

import org.junit.Assert;
import org.junit.Test;

public class UniqueMorseCodeWordsTests {
    UniqueMorseCodeWords uniqueMorseCodeWords = new UniqueMorseCodeWords();

    @Test
    public void testCase() {
        int actual = uniqueMorseCodeWords.uniqueMorseRepresentations( new String[]{"gin", "zen", "gig", "msg"} );
        int expected = 2;
        Assert.assertEquals( expected, actual );
    }
}
