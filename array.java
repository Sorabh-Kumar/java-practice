import java.util.Scanner;
public class array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array - ");
        int n=sc.nextInt();
        int[] arr=new int[n];       // Declaration + size initialization
        int []Arr;                 //Declaration of array
        int ARR[];                 //Declaration of array
        int[] ARr=new int[5];      //Declaring size of array
        System.out.print("Enter the elements of array - ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int element:arr){      //short form of for loop
            System.out.print(element+" ");
        }
    }
}
