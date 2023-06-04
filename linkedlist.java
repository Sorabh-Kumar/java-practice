class linkedlist {
    node head;
    class node {
        String data;
        node next;

        node(String data) {
            this.data = data;
            this.next = null;

        }

    }
    //add - first, last
    public void addFirst(String data){
        node newnode = new node(data);
        if(head==null){
            head = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;
    }
    //add - last
    public void addlast(String data){
        node newnode = new node(data);
        if(head==null){
            head = newnode;
            return;
        }
        node currnode = head;
        while(currnode.next != null){
            currnode = currnode.next;
        }

        currnode.next = newnode;
    }
    public void printlist(){
        if(head== null){
            System.out.println("list is empty");
            return;
        }
        node currnode = head;
        while (currnode != null){
            System.out.print(currnode.data +"->");
            currnode = currnode.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        linkedlist list = new linkedlist();
        list.addFirst("sourabh");
        list.addlast("attri");
        list.printlist();

    }
}
