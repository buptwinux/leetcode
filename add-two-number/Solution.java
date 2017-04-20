/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class ListNode {
    int value;
    ListNode next;
    ListNode(int x) { value = x; }
}

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list1 = l1;
        ListNode list2 = l2;
        ListNode result = new ListNode(0);
        ListNode currentNode = result;
        int sum = 0;

        while(list1 != null || list2 != null) {
            sum /= 10;

            if (list1 != null) {
                sum += list1.value;
                list1 = list1.next; 
            }
            
            if (list2 != null) {
                sum += list2.value;
                list2 = list2.next; 
            }

            ListNode r = new ListNode(sum % 10);
            currentNode.next = r;
            currentNode = currentNode.next;
        } 

        if (sum / 10 == 1) {
            currentNode.next = new ListNode(1); 
        }

        return result.next;
    }

    public static void main(String [] args) {
        //TODO
        ListNode list1 = new ListNode(2);
        ListNode list2 = new ListNode(4);
        ListNode list3 = new ListNode(3);

        list1.next = list2;
        list2.next = list3;


        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(6);
        ListNode node3 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;

        

        list1.next = list2;
        list2.next = list3;

        Solution s1 = new Solution();
        ListNode r = s1.addTwoNumbers(list1, node1);
        
        while(r != null) {
            System.out.println(r.value); 
            r = r.next; 
        }
    }
}

