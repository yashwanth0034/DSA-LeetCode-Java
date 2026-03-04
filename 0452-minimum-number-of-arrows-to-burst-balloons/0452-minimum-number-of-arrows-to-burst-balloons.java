import java.util.*;

class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) return 0;

        // 1️⃣ Sort by ending coordinate
        Arrays.sort(points, (a, b) -> 
            Integer.compare(a[1], b[1])
        );

        int arrows = 1;
        int arrowPos = points[0][1];

        // 2️⃣ Traverse intervals
        for (int i = 1; i < points.length; i++) {
            // If balloon starts after arrow position
            if (points[i][0] > arrowPos) {
                arrows++;
                arrowPos = points[i][1];
            }
        }

        return arrows;
    }
}