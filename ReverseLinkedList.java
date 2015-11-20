/*Given a linked list, remove the nth node from the end of list and return its head.

For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:
Given n will always be valid.
Try to do this in one pass.*/

public class ReverseLinkedList {
	private static ListNode last;
    private static ListNode first;
    
    public static void main(String[] args) {    	
    	ListNode.insert(7);
    	ListNode.insert(1);
    	ListNode.insert(6);
    	ListNode.insert(5);
    	ListNode.insert(2);
        ListNode.printList();
        System.out.println("After executing reverseLinkedList-->");
        ListNode.printList(ListNode.reverseList(first));
    }

    public static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int d1) {
            this.data = d1;
        }
        
        public static ListNode reverseList(ListNode head) {
        	if(head==null || head.next==null)
        		return head;
        	ListNode newHead = reverseList(head.next);
        	head.next.next=head;
        	head.next=null;
            return newHead;
        }
        
        public static ListNode removeNthFromEnd(ListNode head, int n){
        	ListNode slow=head, fast=head;
        	
        	//move fast by n nodes
        	while(fast!=null && n>0){
        		fast=fast.next;
        		n--;
        	}
        	
        	//if fast crosses the tail of list then head needs to be removed, advance the head.
        	if(fast==null)
        		return head.next;
        	
        	//move fast till it reaches the tail, at that time slow will be at previous node of nth node from last
        	while(fast.next!=null){
        		slow=slow.next;
        		fast=fast.next;
        	}
        	//update the references
        	slow.next=slow.next.next;
        	
        	return head;
        }
        
        public static void deleteNode(ListNode node){
        	if(node==null || node.next==null)
        		return;
        	node.data=node.next.data;
        	node.next=node.next.next;
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
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
        
        public static void printList(ListNode head) {
            System.out.println("Elements in the list are");
            System.out.println("-------------------------");
            ListNode temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
}
