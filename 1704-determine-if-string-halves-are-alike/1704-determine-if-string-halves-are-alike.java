class Solution {
    public boolean halvesAreAlike(String s) {
       
        String vowels = "aeiouAEIOU";
        int vowelCount = 0;
        int mid = s.length() / 2;
        
        for (int i = 0; i < mid; i++) {
           
            if (vowels.indexOf(s.charAt(i)) != -1) {
                vowelCount++;
            }
            
            if (vowels.indexOf(s.charAt(i + mid)) != -1) {
                vowelCount--;
            }
        }
        
        
        return vowelCount == 0;
    }
}