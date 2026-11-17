class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder(s);
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
        
            if (vowels.indexOf(sb.charAt(left)) == -1) {
                left++;
            } 
       
            else if (vowels.indexOf(sb.charAt(right)) == -1) {
                right--;
            } 
       
            else {
                char temp = sb.charAt(left);
                sb.setCharAt(left, sb.charAt(right));
                sb.setCharAt(right, temp);
                
                left++;
                right--;
            }
        }

        return sb.toString();
    }
}
