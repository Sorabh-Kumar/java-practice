import java.util.Scanner;
public class rotate_array_optimised {
    public static void rev(int[] arr, int l, int r){
        while(l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = arr[l];
            l++;
            r--;
        }
    }
    public static void rot(int[] arr, int r) {
        int s= arr.length;
        r = r % arr.length;
        //whole rev
        rev(arr, 0 , (s-1) );
       //inverse rotated no.
       rev(arr, 0, r-1);
       //revert next half
       rev(arr, r, s-1);
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