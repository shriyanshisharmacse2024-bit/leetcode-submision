class Solution {
    public void sortColors(int[] nums) {
        for(int j = 0; j < nums.length; j++) {
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]>nums[i]){
                int temp=nums[i-1];
                nums[i-1]=nums[i];
                nums[i]=temp;
            }
        }
    }

    }
}