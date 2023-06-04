import java.util.Scanner;
class Node2{
    Node2() {
        next = null;
    }
    String data;
    Node2 next;
    Node2(String data){
        this.data=data;
        this.next=null;
    }
}
public class linked_list_deletion{
    Node2 head = null;
    private int size;
    linked_list_deletion(){
        this.size=0;
    }
    void DeleteMiddle(String del_data) {
        Node2 prev_node=head;
        Node2 cur_node=head.next;
        while(!cur_node.data.equalsIgnoreCase(del_data)){
            cur_node=cur_node.next;
            prev_node=prev_node.next;
        }
        prev_node.next=cur_node.next;
    }
    void InsertMiddle(String data_prev,String data) {
        Node2 newnode=new Node2();
        newnode.data=data;
        if(head==null){
            head=newnode;
        }
        else {
            Node2 cur_node=head;
            while(!cur_node.data.equalsIgnoreCase(data_prev)){
                cur_node=cur_node.next;
            }
            Node2 temp=cur_node.next;
            cur_node.next=newnode;
            newnode.next=temp;
        }
    }
    public void addFirst(String data){
        Node2 newNode=new Node2(data);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("the list is empty !");
            return;
        }
        head=head.next;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("the list is empty !");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node2 sec_last=head;
        Node2 last_node=head.next;
        while(last_node!=null){
            last_node=last_node.next;
            sec_last=sec_last.next;
        }
        sec_last.next=null;
    }
    public void addLast(String data){
        Node2 newNode=new Node2(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node2 currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
            newNode.next=null;
        }
    }
    public void printList(){
        if(head==null){
            System.out.println("list is empty !!");
        }
        else{
            Node2 currNode=head;
            while(currNode!=null){
                System.out.print(currNode.data+" ");
                currNode = currNode.next;
            }
            System.out.println("");
        }
    }
    public void Size(){
        if(head==null){
            System.out.print(0);
        }
        int size=0;
        Node2 last_node=head;
        while(last_node!=null) {
            last_node=last_node.next;
            size++;
        }
        System.out.println(size);
    }
    public static void main(String[] args){
        linked_list_deletion obj = new linked_list_deletion();
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the data you want to enter in linked list : ");
        obj.addFirst(sc.next());
        obj.addFirst(sc.next());
        obj.addFirst(sc.next());
        obj.addFirst(sc.next());
        obj.addFirst(sc.next());
        obj.addFirst(sc.next());
        obj.addFirst(sc.next());
        obj.addFirst(sc.next());
        obj.Size();
        obj.addLast(sc.next());
        obj.printList();
        obj.deleteFirst();
        obj.printList();
        obj.deleteLast();
        obj.printList();
        //System.out.println("size of linked list is : "+obj.Size());
        String str1,str2,str3;
        System.out.print("enter the data you want to delete : ");
        str1=sc.next();
        obj.DeleteMiddle(str1);
        System.out.print("enter the previous after which you want to insert the data : ");
        str2=sc.next();
        System.out.print("enter the data you want to insert : ");
        str3=sc.next();
        obj.InsertMiddle(str2,str3);
        obj.printList();
    }
}