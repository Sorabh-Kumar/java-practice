import java.util.Scanner;
public class array_input_using_instance_variable{
    int arr[];
    public array_input_using_instance_variable(){
        Scanner sc=new Scanner(System.in);
        arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    public static void main(String[] args) {
        array_input_using_instance_variable obj=new array_input_using_instance_variable();
        for(int res:obj.arr){
            System.out.println(res);
        }
    }
}