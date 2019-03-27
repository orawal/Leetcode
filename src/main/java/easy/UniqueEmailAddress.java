package easy;

import java.util.HashSet;
import java.util.Set;

// Leetcode problem: 929
// https://leetcode.com/problems/unique-email-addresses/
public class UniqueEmailAddress {
    public int numUniqueEmails(String[] emails) {
        Set uniqueEmails = new HashSet();
        for ( String email: emails ) {
            int splitIndex = email.indexOf( '@' );
            String localName = email.substring( 0, splitIndex );
            String domain = email.substring( splitIndex );
            if ( email.contains( "+" ) ) {
                localName = localName.substring( 0, email.indexOf( "+" ) );
            }

            localName = localName.replaceAll( "\\.", "");

            if ( !uniqueEmails.contains( localName + domain ) ) {
                uniqueEmails.add( localName + domain );
            }
        }
        return uniqueEmails.size();
    }
}
