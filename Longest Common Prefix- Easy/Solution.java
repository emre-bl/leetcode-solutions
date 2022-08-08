class Solution {
  String prefixFind(String s1, String s2) {
      String com = "";
      int len = 0;
      if(s1.length() >= s2.length()) len = s2.length();
      else len = s1.length();
          
      for(int i=0; i<len; i++) {
          if(s1.split("")[i].equals(s2.split("")[i])) com = com+s1.split("")[i];
          else return com;
      }
      return com;
  }
  
  public String longestCommonPrefix(String[] strs) {
      String common = "";
      
      boolean is = false;
                      
      for(String s: strs) {
          if(is && common.equals("")) return "";
          
          if(common.equals("")) {
              common = s;
              is = true;
          }
          
          else common = prefixFind(common,s);
      }
      
      return common;
  }
}