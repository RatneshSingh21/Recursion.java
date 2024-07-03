//question:https://leetcode.com/problems/subsets/description/

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resultSet=new ArrayList<>();
        backtrack(resultSet,new ArrayList<>(),nums,0);

       return resultSet;
    }
     public void backtrack(List<List<Integer>> resultSet,List<Integer>temp,int[] nums,int start)
        {
            //adding a set to resultset
            resultSet.add(new ArrayList<>(temp));
            for(int i=start;i<nums.length;i++)
            {
                //including number
               temp.add(nums[i]);
                 
                 //backtrackthe new Subset
                backtrack(resultSet,temp,nums,i+1);
                 
                 //case of not including the number
                temp.remove(temp.size()-1);
            }
        }
}
