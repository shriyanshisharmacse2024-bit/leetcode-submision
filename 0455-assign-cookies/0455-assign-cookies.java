class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(s.length==0|| g.length==0){
            return 0;
        }
       Arrays.sort(g);
       Arrays.sort(s);
       int i =0;
       int j =0;
        int ans =0;
        while(i<g.length&&j<s.length){
            if(s[j]>=g[i]){
                ans++;
                i++;
            }
            j++;
        }
        return ans;
    }

}  