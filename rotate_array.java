import java.util.Scanner;

public class rotate_array {
public static void rot(int[] arr, int r) {
    r = r % arr.length;
    for(int i = 0 ; i<r; i++){
        int l = arr[-1];
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
            a[0]= sc.nextInt();
        }
        System.out.println("enter value for rotation"); 
        int r = sc.nextInt();
        rot(a[], r); 
        }
}
