class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>();

        if (digits.length() == 0) {
            return ans;
        }

        String[] keypad = {
            "", "", "abc", "def",
            "ghi", "jkl", "mno",
            "pqrs", "tuv", "wxyz"
        };

        backtrack(0, digits, "", keypad, ans);

        return ans;
    }

    void backtrack(int index, String digits, String current,
                   String[] keypad, List<String> ans) {

        if (index == digits.length()) {
            ans.add(current);
            return;
        }

        int number = digits.charAt(index) - '0';

        String letters = keypad[number];

        for (char ch : letters.toCharArray()) {
            backtrack(index + 1, digits, current + ch, keypad, ans);
        }
    }
}