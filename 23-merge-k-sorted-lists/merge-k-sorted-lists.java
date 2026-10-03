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
class Solution {
    public ListNode mergeKLists(ListNode[] lists) 
    {
       ArrayList <Integer> n = new ArrayList <>();

       for (ListNode list : lists)
       {
        while (list != null)
        {
         n.add(list.val);
         list = list.next;
       }}

       Collections.sort(n);
       ListNode d = new ListNode();
       ListNode c = d;
       for (int k : n)
       {
        c.next = new ListNode(k);
        c = c.next;
       }
       return d.next;


    }
}