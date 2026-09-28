class Solution {
    public int[][] transpose(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        
        // The transposed matrix will have 'c' rows and 'r' columns
        int[][] result = new int[c][r];
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                // Swap row and column indices
                result[j][i] = matrix[i][j];
            }
        }
        
        return result;
    }
}
