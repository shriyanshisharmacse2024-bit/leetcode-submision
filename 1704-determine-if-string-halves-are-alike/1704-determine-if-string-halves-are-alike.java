class Solution {
    public boolean halvesAreAlike(String s) {
        int a = 0, b = 0;
        int n = s.length();

        String v = "aeiouAEIOU";

        for (int i = 0; i < n / 2; i++) {
            if (v.indexOf(s.charAt(i)) >= 0)
                a++;

            if (v.indexOf(s.charAt(i + n / 2)) >= 0)
                b++;
        }

        return a == b;
    }
}