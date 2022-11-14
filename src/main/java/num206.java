public class num206 {
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode pre = null;
            ListNode temp;
            ListNode cur = head;

            if (head == null || head.next == null) {
                return head;
            }

            while (cur != null) {
                temp = cur.next;
                cur.next = pre;
                pre = cur;
                cur = temp;
            }


            return pre;
        }
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}