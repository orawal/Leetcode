package easy;

import org.junit.Assert;
import org.junit.Test;

public class UniqueEmailAddressTests {
    UniqueEmailAddress uniqueEmailAddress = new UniqueEmailAddress();

    @Test
    public void testCase() {
        int actual = uniqueEmailAddress.numUniqueEmails(
                new String[]{"test.email+alex@leetcode.com",
                        "test.e.mail+bob.cathy@leetcode.com",
                        "testemail+david@lee.tcode.com"} );

        int expected = 2;
        Assert.assertEquals( expected, actual );
    }
}
