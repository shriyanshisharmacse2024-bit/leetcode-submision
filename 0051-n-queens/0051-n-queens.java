import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> results = new ArrayList<>();
        // Tracks columns where queens are placed
        boolean[] cols = new boolean[n];
        // Tracks normal diagonals (row + col is constant)
        boolean[] diag1 = new boolean[2 * n];
        // Tracks reverse diagonals (row - col is constant, +n to avoid negative indices)
        boolean[] diag2 = new boolean[2 * n];
        
        // Use a char array representation of the board for efficiency
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        
        backtrack(0, n, board, results, cols, diag1, diag2);
        return results;
    }
    
    private void backtrack(int row, int n, char[][] board, List<List<String>> results,
                           boolean[] cols, boolean[] diag1, boolean[] diag2) {
        // Base case: All queens are placed successfully
        if (row == n) {
            results.add(constructBoard(board));
            return;
        }
        
        for (int col = 0; col < n; col++) {
            int d1 = row + col;
            int d2 = row - col + n;
            
            // Check if placing a queen here is safe
            if (cols[col] || diag1[d1] || diag2[d2]) {
                continue;
            }
            
            // Place the queen and mark constraints
            board[row][col] = 'Q';
            cols[col] = true;
            diag1[d1] = true;
            diag2[d2] = true;
            
            // Move to the next row
            backtrack(row + 1, n, board, results, cols, diag1, diag2);
            
            // Revert changes (Backtrack)
            board[row][col] = '.';
            cols[col] = false;
            diag1[d1] = false;
            diag2[d2] = false;
        }
    }
    
    // Helper function to convert the char array into the requested List<String> format
    private List<String> constructBoard(char[][] board) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            list.add(new String(board[i]));
        }
        return list;
    }
}
