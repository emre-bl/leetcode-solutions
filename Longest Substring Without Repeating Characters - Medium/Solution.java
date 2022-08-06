class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length() == 0) return 0;
        
        List<String> myList = new ArrayList<String>(Arrays.asList(s.split("")));
        
        ArrayList<String> longest = new ArrayList<>();
        int max = 0;
        for(int i = 0; i < myList.size(); i++) {
            for(String str: myList.subList(i, myList.size())) {
                if(longest.contains(str)) break;
                else longest.add(str);
            }
            int size = longest.size();
            if(size > max) max = longest.size();
            longest = new ArrayList<>();
        }
        
        
        return max;
        
    }
}