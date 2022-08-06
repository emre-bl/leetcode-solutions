/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

import java.util.*;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {      
        
    
        String sum = "";
        boolean elde = false;
        
        while(l1!=null || l2!=null || elde) {
            int n1 = 0, n2 = 0;
            if(l1!=null) {
                n1 = l1.val;
                l1 = l1.next;
            } 
            
            if(l2!=null) {
                n2 = l2.val;
                l2 = l2.next;
            }
            
                
            if(elde) {
                if(n1+n2+1 >= 10) sum = sum + (n1+n2+1)%10;
                else {
                    sum = sum + (n1+n2+1);
                    elde = false;
                }
            } else {
                if(n1+n2 >= 10) {
                    sum = sum + (n1+n2)%10;
                    elde = true;
                }
                else sum = sum + (n1+n2);
            }
            
        }
            
    
        List<String> myList = new ArrayList<String>(Arrays.asList(sum.split("")));
        
        
        ListNode org = new ListNode(Integer.parseInt(myList.get(myList.size()-1)));
         
        for(int i = myList.size()-2 ; i >= 0 ; i--) {
            ListNode newNode = new ListNode(Integer.parseInt(myList.get(i)));
            newNode.next = org;
            org = newNode;
        }
        
        return org;    
        
    }
}