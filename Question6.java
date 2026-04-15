class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class Question6 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + (curr.next != null ? " " : ""));
            curr = curr.next;
        }
        // 預期輸出: 1 2 3 4
    }
}