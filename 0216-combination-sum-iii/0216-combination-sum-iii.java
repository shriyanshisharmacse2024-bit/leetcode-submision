import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(k, n, 1, new ArrayList<>(), ans);
        return ans;
    }

    private void dfs(int k, int n, int start, List<Integer> path, List<List<Integer>> ans) {
        // Base case: if we found a valid combination of k numbers that sum up to n
        if (k == 0 && n == 0) {
            ans.add(new ArrayList<>(path));
            return;
        }
        // Pruning: if we used up k numbers or the target sum became negative
        if (k == 0 || n < 0) {
            return;
        }

        for (int i = start; i <= 9; i++) {
            path.add(i); // Choose the current number
            dfs(k - 1, n - i, i + 1, path, ans); // Explore next numbers
            path.remove(path.size() - 1); // Backtrack
        }
    }
}
