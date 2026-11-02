class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         int row = matrix.length;
         int col = matrix[0].length;

         int n = row * col;

         int s = 0;
         int e = n-1;

         while(s <= e){
            int mid = s + ( e - s)/2;
            int rowindex = mid / col;
            int colindex = mid % col;

            if(matrix[rowindex][colindex] == target){
                return true;
            }
            else if(matrix[rowindex][colindex] > target){
                e = mid - 1;
            }else{
                s = mid + 1;
            }

        
         }
         return false;
    }
}
        
    