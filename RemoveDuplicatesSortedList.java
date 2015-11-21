/*Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.*/

public class RemoveDuplicatesSortedList {
	private static ListNode last;
    private static ListNode first;
    
    public static void main(String[] args) {
    	ListNode.insert(1);
    	ListNode.insert(1);
    	ListNode.insert(1);
    	ListNode.insert(2);
    	ListNode.insert(2);
    	ListNode.insert(2);
    	ListNode.insert(3);
    	ListNode.insert(3);
    	ListNode.insert(3);
        ListNode.printList();
        System.out.println("After executing deleteDuplicates-->");
        ListNode.printList(ListNode.deleteDuplicates(first));
    }

    public static class ListNode {
        private int val;
        private ListNode next;

        public ListNode(int d1) {
            this.val = d1;
        }
        
        public static ListNode deleteDuplicates(ListNode head) {
            ListNode orgHead= head;
            if(head==null || head.next==null)
                return head;
            while(head.next!=null){
                if(head.val==head.next.val)
                    head.next=head.next.next;
                else
                    head=head.next;
            }
            return orgHead;
        }

        public static void insert(int d1) {
            ListNode a = new ListNode(d1);
            a.next = null;
            if (first != null) {
                last.next = a;
                last = a;
            } else {
                first = a;
                last = a;
            }
            System.out.println("Inserted -:"+d1);
        }

        public static void printList() {
            System.out.println("Elements in the list are");
            System.out.println("-------------------------");
            ListNode temp = first;
            while (temp != null) {
                System.out.println(temp.val);
                temp = temp.next;
            }
        }
        
        public static void printList(ListNode head) {
            System.out.println("Elements in the list are");
            System.out.println("-------------------------");
            ListNode temp = head;
            while (temp != null) {
                System.out.println(temp.val);
                temp = temp.next;
            }
        }
    }
}
