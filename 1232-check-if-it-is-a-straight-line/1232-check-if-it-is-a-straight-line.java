class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x1, x2;
        int y1, y2;
        double slope1;
        for (int a = 0; a < coordinates.length - 2; a++) {
            x1 = coordinates[a + 1][0] - coordinates[a][0];
            x2 = coordinates[a + 2][0] - coordinates[a + 1][0];
            y1 = coordinates[a + 1][1] - coordinates[a][1];
            y2 = coordinates[a + 2][1] - coordinates[a + 1][1];
            if ((x1 == 0 && x2 != 0) || (x1 != 0 && x2 == 0)) {
                return false;
            }

            if (x1 == 0 && x2 == 0) {
                // points are the same, do nothing
            }
            else {
                slope1 = (double)y1 / (double)x1;
                double slope2 = (double)y2 / (double)x2;
                if (slope1 != slope2) {
                    return false;
                }
            }
        }
        return true;
    }
}
