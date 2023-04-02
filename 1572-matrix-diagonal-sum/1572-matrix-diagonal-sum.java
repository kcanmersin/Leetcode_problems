class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int a = 0; a < mat.length; a++) {
            sum += mat[a][a];
            sum += mat[mat.length - a - 1][a];
        }
        if (mat.length % 2 == 1) {
            sum -= mat[mat.length / 2][mat.length / 2];
        }
        return sum;
    }
}
