class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        if (ransomNote.length() > magazine.length()) return false;
        
        int[] cc = new int[26];

        for (char c : ransomNote.toCharArray()) {
            int idx = magazine.indexOf(c, cc[c - 'a']);
            if (idx == -1) return false;

            cc[c-'a'] = idx+1;
        }
        
        return true;
    }
}