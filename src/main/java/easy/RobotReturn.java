package easy;

// Leetcode Question: 657
// https://leetcode.com/problems/robot-return-to-origin/
public class RobotReturn {
    public boolean judgeCircle( String moves ) {
        int x = 0, y = 0;
        for ( char move: moves.toCharArray() ) {
            if ( move == 'L' ) {
                x--;
            } else if ( move == 'R' ) {
                x++;
            } else if ( move == 'U' ) {
                y++;
            } else if ( move == 'D' ) {
                y--;
            }
        }
        return x == 0 && y == 0;
    }
}
