import java.util.Scanner;
class Node1{
    String data;
    Node1 next;
    Node1(String data){
        this.data=data;
        this.next=null;
    }
}
public class linked_list{
    Node1 head = null;
    public void addFirst(String data){
        Node1 newNode=new Node1(data);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    public void addLast(String data){
        Node1 newNode=new Node1(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node1 currNode = head;
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
        Node1 currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" ");
            currNode = currNode.next;
            }
        }
    }
    public static void main(String[] args){
        linked_list obj = new linked_list();
        String str1,str2,str3,str4;
        Scanner sc=new Scanner(System.in);
        obj.addFirst(sc.next());
        obj.addFirst(sc.next());
        obj.addFirst(sc.next());
        obj.addLast(sc.next());
        obj.printList();
    }
}
