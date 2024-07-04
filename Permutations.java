//question:https://leetcode.com/problems/permutations/description/

class Solution {
    public List<List<Integer>> permute(int[] nums) {
         List<List<Integer>> resultSet=new ArrayList<>();
        backtrack(resultSet,new ArrayList<>(),nums);

       return resultSet;
    }
     public void backtrack(List<List<Integer>> resultSet,ArrayList<Integer>temp,int[] nums)
     {
        // If we match the length, it is a permutation
        if(temp.size()==nums.length)
        {
            resultSet.add(new ArrayList<>(temp));
            return ;
        }
        for(int number:nums)
        {
              // Skip if we get same element
            if(temp.contains(number))
                continue;

              //// Add the new element
                temp.add(number);

                 // Go back to try other element
                backtrack(resultSet,temp,nums);
                
                //remove the element
                temp.remove(temp.size()-1);
            
            
            
        }
     }
}
