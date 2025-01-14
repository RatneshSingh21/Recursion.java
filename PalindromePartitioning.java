class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> resultSet =new ArrayList<>();
        backTrack(s,resultSet,new ArrayList<>(),0);
        return resultSet;

    }
    public void backTrack(String s, List<List<String>> resultSet, List<String> temp, int start)
    {
        if (start == s.length()) {
            resultSet.add(new ArrayList<>(temp));  // add a copy of temp to result
            return;
        }
       for(int i=start;i<s.length();i++)
       {
         String substring = s.substring(start, i + 1);
         if(isPalindrome(substring))
         {
            temp.add(substring);
            backTrack(s,resultSet,temp,i+1);
            temp.remove(temp.size() - 1);
         }
       }
    }
    public boolean isPalindrome(String s){
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
