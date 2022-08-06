class Solution {
    public boolean isPalindrome(int x) {
        String sx = String.valueOf(x);
        
        for(int i = 0; i <= sx.length()/2; i++) {
            int j = sx.length()-1-i;
            if(sx.charAt(i) != sx.charAt(j)) return false;
        }
        
        return true;
        
    }
}