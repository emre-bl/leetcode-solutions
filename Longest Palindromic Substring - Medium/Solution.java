class Solution {
    
    boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < (n/2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;
    }
    
    
    public String longestPalindrome(String s) {
        
        if(s.length() == 1) return s;
        
        String longest = "";
        
        for(int start = 0; start<s.length()-longest.length(); start++)
            for(int end = s.length(); end >= start+longest.length(); end--) {
                String temp_word = s.substring(start,end);
                if(isPalindrome(temp_word))
                    longest = temp_word;
        }
        
        return longest;
    }