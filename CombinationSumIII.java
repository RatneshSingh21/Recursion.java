class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> resultSet=new ArrayList<>();
         backtrack(resultSet, new ArrayList<>(), k, n, 1);
        return resultSet;

    }
    public void backtrack(List<List<Integer>> resultSet, List<Integer> temp, int k, int n, int start)
    {
        if (temp.size() == k && n == 0) {
            resultSet.add(new ArrayList<>(temp));
            return;
        }
       for (int i = start; i <= 9; i++) {
            temp.add(i); 
            backtrack(resultSet, temp, k, n - i, i + 1); 
            temp.remove(temp.size() - 1); 
        }
    }
}
