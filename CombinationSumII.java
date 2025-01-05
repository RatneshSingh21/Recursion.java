class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
           List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(candidates); // Sort to handle duplicates
        slow(0, target ,candidates, curr, result);
        return result;
         
    }
    public void slow(int idx,int target,int[]arr,List<Integer> curr, List<List<Integer>> result)
    {
        if(target<0)
        {
            return;
        }
        if(target==0)
        {
             result.add(new ArrayList<>(curr));
            return;
        }

        for(int i=idx;i<arr.length;i++)
        {
            if(i>idx &&  arr[i] == arr[i - 1])
            {
                continue;
            }
             curr.add(arr[i]);
        slow(i+1,target-arr[i],arr,curr,result);
         curr.remove(curr.size() - 1);
        }
       
    }
}
