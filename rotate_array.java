import java.util.Scanner;

public class rotate_array {
public static void rot(int[] arr, int r) {
    r = r % arr.length;
    for(int i = 0 ; i<r; i++){
        int l = arr[arr.length-1];
        for(int j = arr.length; j>0; j--){
            arr[j]= arr[j-1];
        }
        arr[0] = l;
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i = 0; i<n;i++){
            a[i]= sc.nextInt();
        }
        for(int v : a){
            System.out.print(v+" ");
        }
        System.out.println();
        System.out.println("enter value for rotation"); 
        int r = sc.nextInt();
        rot(a, r); 
        for(int v : a){
            System.out.print(v+" ");
        }
        System.out.println();
        }
}
