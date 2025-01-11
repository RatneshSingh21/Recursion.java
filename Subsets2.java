class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> resultSet  = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(resultSet,new ArrayList<>(),nums,0);
        return resultSet;
    }
    public void backtrack(List<List<Integer>> resultSet,List<Integer> tempSet,int[] nums,int start)
    {
        if(resultSet.contains(tempSet)){
            return;
        }
        resultSet.add(new ArrayList<>(tempSet));
        for(int i=start;i<nums.length;i++)
        {
            tempSet.add(nums[i]);
            backtrack(resultSet,tempSet,nums,i+1);
            tempSet.remove(tempSet.size()-1);
        }
    }
}
