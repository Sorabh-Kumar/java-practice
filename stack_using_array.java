import java.util.*;
public class stack_using_array{
    int arr[];
    int top;
    stack_using_array(){
        arr=new int[5];
        top=-1;
    }
    void push(){
        if(top==arr.length-1){
            System.out.println("Stack is full ");
        }
        else{
            System.out.println("Enter data");
            Scanner sc2=new Scanner(System.in);
            int data=sc2.nextInt();
            top+=1;
            arr[top]=data;
            System.out.println("Data inserted");
        }
    }
    void pop(){
        if(top==-1){
            System.out.println("Stack empty");
        }
        else{
            System.out.println("deleted..."+arr[top]);
            top-=1;
        }
    }
    void view(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Stack elements are :");
            for(int i=top;i>=0;i--){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        stack_using_array obj=new stack_using_array();
        while(true){
            System.out.println("Press 1 for push");
            System.out.println("Press 2 for pop");
            System.out.println("Press 3 for display");
            System.out.println("Press 4 for exit");
            System.out.println("Enter your choice");
            Scanner sc= new Scanner(System.in);
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    obj.push();
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.view();
                    break;
                case 4:
                    System.out.println(0);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}