/*Given a linked list, remove the nth node from the end of list and return its head.

For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:
Given n will always be valid.
Try to do this in one pass.*/

public class RemoveNthNodeFromEnd {
	private static Link last;
    private static Link first;
    
    public static void main(String[] args) {    	
    	Link.insert(7);
    	Link.insert(1);
    	Link.insert(6);
    	Link.insert(5);
    	Link.insert(2);
        Link.printList();
        System.out.println("After executing deleteNode-->");
        Link.printList(Link.removeNthFromEnd(first, 2));
    }

    public static class Link {
        private int data;
        private Link nextlink;

        public Link(int d1) {
            this.data = d1;
        }
        
        public static Link removeNthFromEnd(Link head, int n){
        	Link slow=head, fast=head;
        	
        	//move fast by n nodes
        	while(fast!=null && n>0){
        		fast=fast.nextlink;
        		n--;
        	}
        	
        	//if fast crosses the tail of list then head needs to be removed, advance the head.
        	if(fast==null)
        		return head.nextlink;
        	
        	//move fast till it reaches the tail, at that time slow will be at previous node of nth node from last
        	while(fast.nextlink!=null){
        		slow=slow.nextlink;
        		fast=fast.nextlink;
        	}
        	//update the references
        	slow.nextlink=slow.nextlink.nextlink;
        	
        	return head;
        }
        
        public static void deleteNode(Link node){
        	if(node==null || node.nextlink==null)
        		return;
        	node.data=node.nextlink.data;
        	node.nextlink=node.nextlink.nextlink;
        }
        

        public static void insert(int d1) {
            Link a = new Link(d1);
            a.nextlink = null;
            if (first != null) {
                last.nextlink = a;
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
            Link temp = first;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.nextlink;
            }
        }
        
        public static void printList(Link head) {
            System.out.println("Elements in the list are");
            System.out.println("-------------------------");
            Link temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.nextlink;
            }
        }
    }
}
