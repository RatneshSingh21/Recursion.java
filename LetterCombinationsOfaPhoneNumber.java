class Solution {
    public List<String> letterCombinations(String digits) {
         if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }

        // Mapping of digits to corresponding letters
        String[] mapping = {
            "",     
            "",     
            "abc",  
            "def",  
            "ghi",  
            "jkl",  
            "mno",  
            "pqrs", 
            "tuv",  
            "wxyz"  
        };

        List<String> result = new ArrayList<>();
        backtrack(digits, mapping, 0, new StringBuilder(), result);
        return result;
    }

    public void backtrack(String digits, String[] mapping, int index, StringBuilder combination, List<String> result)
    {
        if (index == digits.length()) {
            result.add(combination.toString());
            return;
        }

        // Get the letters corresponding to the current digit
        String letters = mapping[digits.charAt(index) - '0'];

        for (char letter : letters.toCharArray()) {
            combination.append(letter); // Choose
            backtrack(digits, mapping, index + 1, combination, result); // Explore
            combination.deleteCharAt(combination.length() - 1); // Backtrack
        }
    }
}
