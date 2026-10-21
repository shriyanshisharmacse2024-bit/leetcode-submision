class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
       int r = 0 ;
       int c = 0;
       int n = mat.length;
       int m = mat[0].length;
       int[] arr = new int[n*m];
       int d = 0;
       for(int i = 0 ; i < n * m  ; i++){
         arr[i] = mat[r][c];
         if(d == 0){
            if(c==m-1){
                r++;
                d++;
            }
            else if(r == 0 ){
                c++;
                d++;
            }
            else{
                r--;
                c++;
            }
         }
         else{
            if(r == n-1){
                c++;
                d--;
            }
            else if(c == 0 ){
                r++;
                d--;
            }
            else{
                r++;
                c--;
            }
         }
       }
       return arr;
    }
}