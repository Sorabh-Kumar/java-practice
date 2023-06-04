import java.util.*;
class stack_using_array1{
    int arr[];
    int top;
    stack_using_array1(int n){
        arr=new int[n];
        top=-1;
    }
    void push() {
        if (top==arr.length-1) {
            System.out.println("Stack is full !!!! ");
        }
        else{
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter the data :");
            while (top != arr.length - 1){
                top += 1;
                arr[top] = sc1.nextInt();
            }
        }
    }
    void pop(){
        if(top==-1){
            System.out.println("Stack is empty :");
        }
        else{
            System.out.println("Deleted element is : "+arr[top]);
            top-=1;
        }
    }
    void view(){
        if(top==-1){
            System.out.println("Stack is empty !");
        }
        else{
            System.out.print("Elements of stack are : ");
            while (top>=0) {
                System.out.print(arr[top]+" ");
                top-=1;
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of stack : ");
        stack_using_array1 obj=new stack_using_array1(sc.nextInt());
        while(true) {
            System.out.print("Enter your command choice : ");
            String choice =sc.next();
            switch (choice) {
                case "Push":
                    obj.push();
                    break;
                case "Pop":
                    obj.pop();
                    break;
                case "View":
                    obj.view();
                    break;
                case "Exit":
                    System.out.print("Code is executed successfully !!!!");
                    System.exit(0);
                default:
                    System.out.println("Invalid input !!!!");
            }
        }
    }
}