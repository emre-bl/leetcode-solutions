class Solution {
    public static String removeAllNonAlphaNumeric(String s) {
        if (s == null) {
            return null;
        }
        return s.replaceAll("[^A-Za-z0-9]", "");
    }
    
    public boolean isPalindrome(String s) {
        s = removeAllNonAlphaNumeric(s.toLowerCase());
        
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)) return false;
        }
        
        return true;
    }
}