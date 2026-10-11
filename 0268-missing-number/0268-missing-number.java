class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int num : nums){
            sum = sum^ num;
        }

        int n = nums.length;
        for(int i = 0 ; i <= n ; i++){
            sum = sum ^ i;
        }
        return sum;
    }
}