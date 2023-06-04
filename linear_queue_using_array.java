import java.util.Scanner;
public class linear_queue_using_array{
    int[] ar;
    int Front,Rear;
    linear_queue_using_array(){
        ar=new int [5];
        Front=-1;
        Rear=-1;
    }
    void insert(){
        if(Rear == ar.length - 1){
            System.out.println("Queue is Full!");
        }
        else{
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter data : ");
            int data = sc.nextInt();
            if(Front == -1)
                Front++;
            Rear++;
            ar[Rear] = data;
            System.out.println("Data Inserted!");
        }
    }
    void delete(){
        if (Front==-1){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("Deleted..."+ar[Front]);
            if (Front==Rear){
                Front=-1;
                Rear=-1;
            }
            else if(Front<Rear){
                Front+=1;
            }
        }
    }
    void traverse(){
        if(Front==-1 || Rear==-1){
            System.out.println("linear queue is Empty");
        }
        else{
            for(int i=Front;i<=Rear;i++){
                System.out.print(ar[i]+" ");
            }
        }
    }
    public static void main(String[] args){
        linear_queue_using_array obj = new linear_queue_using_array();
        while (true){
            System.out.println("Press 1 for insert");
            System.out.println("Press 2 for delete");
            System.out.println("Press 3 for traverse");
            System.out.println("Press 4 for Exit");
            System.out.println("Enter your choice");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice){
                case 1 -> obj.insert();
                case 2 -> obj.delete();
                case 3 -> obj.traverse();
                case 4 -> System.exit(0);
                default -> System.out.println("Invalid choice");
            }
        }
    }
}