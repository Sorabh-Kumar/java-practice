class LinkedList {

    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int item)
        {
            data = item;
            next = null;
        }
    }

    /* Function to reverse all even
       positioned node and append at the end
       odd is the head node of given linked list */
    void rearrange(Node odd)
    {

        // If linked list has less than 3 nodes,
        // no change is required
        if (odd == null || odd.next == null
                || odd.next.next == null) {
            return;
        }

        // even points to the beginning
        // of even list
        Node even = odd.next;

        // Remove the first even node
        odd.next = odd.next.next;

        // odd points to next node in odd list
        odd = odd.next;

        // Set terminator for even list
        even.next = null;

        // Traverse the  list
        while (odd.next != null) {

            // Store the next node in odd list
            Node temp = odd.next.next;

            // Link the next even node at the
            // beginning of even list
            odd.next.next = even;
            even = odd.next;

            // Remove the even node from middle
            odd.next = temp;

            // Move odd to the next odd node
            if (temp != null) {
                odd = temp;
            }
        }

        // Append the even list at the end of odd list
        odd.next = even;
    }

    /* Function to print nodes in a given linked list */
    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next = new Node(6);
        list.head.next.next.next.next.next.next = new Node(7);

        System.out.println("Linked list before calling rearrange : ");
        list.printList(head);

        System.out.println("");
        list.rearrange(head);

        System.out.println("Linked list after calling rearrange : ");
        list.printList(head);
    }
}