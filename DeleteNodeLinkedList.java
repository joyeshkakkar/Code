/*Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.

Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, the linked list should become 1 -> 2 -> 4 after calling your function.*/

public class DeleteNodeLinkedList {
	private static Link last;
    private static Link first;
    
    public static void main(String[] args) {    	
    	Link.insert(7);
    	Link.insert(1);
    	Link.insert(6);
    	Link.insert(5);
    	Link.insert(2);
        Link.printList();
        Link.deleteNode(first.nextlink.nextlink.nextlink);
        System.out.println("After executing deleteNode-->");
        Link.printList();
    }

    public static class Link {
        private int data;
        private Link nextlink;

        public Link(int d1) {
            this.data = d1;
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
