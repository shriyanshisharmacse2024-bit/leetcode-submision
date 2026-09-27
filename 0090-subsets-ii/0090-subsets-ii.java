class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());

        int start = 0;

        for (int j = 0; j < nums.length; j++) {

            int size = ans.size();

            if (j > 0 && nums[j] == nums[j - 1]) {
                
            } else {
                start = 0;
            }

            for (int i = start; i < size; i++) {
                List<Integer> newList =
                    new ArrayList<>(ans.get(i));

                newList.add(nums[j]);
                ans.add(newList);
            }

            start = size;
        }

        return ans;
    }
}