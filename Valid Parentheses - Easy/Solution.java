import java.util.*;

class Solution {      
    public boolean isValid(String input_str) {
        Stack<Character> s = new Stack<Character>();
        for (char st : input_str.toCharArray()) {
      
            if (st == '(' || st == '{' || st == '[') {
            s.push(st);
        }
        else {
        
            if(s.empty()) {
                return false;
            } else {
          
                char top = (Character) s.peek();
                if(st == ')' && top == '(' ||
                st == '}' && top == '{' ||
                st == ']' && top == '['){
                    s.pop();
                }
          else{
                return false;
          }
        }
      }
    }
    
    if(s.empty()) {
        return true;
    }
    else{
        return false;
    }
  }
}