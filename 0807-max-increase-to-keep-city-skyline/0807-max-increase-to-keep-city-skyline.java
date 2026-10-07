class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int[] rowMax = new int[n];
        int[] colMax = new int[m];

        // Row maximum
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                rowMax[i] = Math.max(rowMax[i], grid[i][j]);
            }
        }

        // Column maximum
        for(int j = 0; j < m; j++) {
            for(int i = 0; i < n; i++) {
                colMax[j] = Math.max(colMax[j], grid[i][j]);
            }
        }

        int answer = 0;

        // Maximum possible increase
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {

                int newHeight = Math.min(rowMax[i], colMax[j]);

                answer += newHeight - grid[i][j];
            }
        }

        return answer;
    }
}