class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i =0; i < numRows;i++){
            List<Integer> ans = new ArrayList<>();
            ans.add(1);
            for(int j = 1; j < i ; j++){
                int sum = result.get(i-1).get(j-1)+result.get(i-1).get(j);
                ans.add(sum);
            }
                if(i> 0){
                   ans.add(1);
                }

                result.add(ans);

            
        }
        return result;
        
    }
}