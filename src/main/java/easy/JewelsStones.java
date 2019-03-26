package easy;

// Leetcode question: 771
// https://leetcode.com/problems/jewels-and-stones/
public class JewelsStones {
    public int numJewelsInStones(String J, String S) {
        if ( J == null || J.length() < 1 || S == null || S.length() < 1) {
            return 0;
        }
        return S.replaceAll("[^" + J + "]", "").length();
    }
}
