/*
Q22 - Palindrome Linked List
Given a singly linked list, determine if it is a palindrome.
Follow up:
Could you do it in O(n) time and O(1) space?


Ans - */ 
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        
        if(head == null)
            return true;
            
        //1 - Find Middle Middle of Linked List (First will increment once , second will twice)
        ListNode first , sec;
        first = sec = head;
        
        while((sec != null) && (sec.next != null)) {
            first = first.next;
            sec = sec.next.next;
        }
        
        //2 - Reverse the second part
        ListNode nxt_node,prev;
        prev = null;
        while(first != null) {
            nxt_node = first.next;
            first.next = prev;  //Sets null for first time
            prev = first;
            first = nxt_node;
        }
        
        //3 - Compare bothe the halves and return result
        first = head;
        while (prev != null && (first.val == prev.val)) {
            first = first.next;
            prev = prev.next;
        }
        return prev == null;
    }

