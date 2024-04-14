
// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MiddleOfTheLinkedList876 {


    public static ListNode middleNode(ListNode head) {
        ListNode node = head;
        int size = 1;

        while(node.next != null) {
            node = node.next;
            size++;
        }

        size /= 2;

        for (int i = 0; i < size; i++) {
            head = head.next;
        }

        return head;
    }

    public static void main(String[] args) {

        ListNode n1 = new ListNode(6);
        ListNode n2 = new ListNode(5, n1);
        ListNode n3 = new ListNode(4, n2);
        ListNode n4 = new ListNode(3, n3);
        ListNode n5 = new ListNode(2, n4);
        ListNode n6 = new ListNode(1, n5);

        ListNode node = middleNode(n5);

        System.out.println(node.val);
        while(node.next != null) {
            node = node.next;
            System.out.println(node.val);
        }

    }
    
}
