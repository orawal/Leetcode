package easy;

// Leetcode Question: 709
// https://leetcode.com/problems/to-lower-case/
public class ToLowerCase {
    public String toLowerCase(String str) {
        StringBuilder result = new StringBuilder();
        for( char c: str.toCharArray() ) {
            int charAscii = ( int ) c;
            if ( charAscii < 97 && charAscii > 64 ) {
                c = (char) ( charAscii + 32 );
            }
            result.append( c );
        }
        return result.toString();
    }
}
