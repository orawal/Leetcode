package easy;

import java.util.HashSet;
import java.util.Set;

// Leetcode Question: 804
// https://leetcode.com/problems/unique-morse-code-words/
public class UniqueMorseCodeWords {
    public static final String[] MORSE_LOOKUP = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",
            ".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    public int uniqueMorseRepresentations(String[] words) {
        Set uniqueRepresentation = new HashSet();
        for ( String word: words ) {
            StringBuilder transformedWord = new StringBuilder();
            for ( char c: word.toCharArray() ) {
                transformedWord.append( MORSE_LOOKUP[ c - 'a' ] );
            }

            if ( !uniqueRepresentation.contains( transformedWord.toString() ) ) {
                uniqueRepresentation.add( transformedWord.toString() );
            }
        }
        return uniqueRepresentation.size();
    }
}
