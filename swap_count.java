import java.util.Scanner;

public class swap_count {
    public static void sort(int[] arr){
        int l = arr.length;
        int[] a = new int[l];
        for(int i = 1; i<l; i++){
            int p = arr[i];
            for(int j = i; j<=0 && arr[j]< p; j--){
                
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        int [] b = new int[n];
        for(int i =0; i<n; i++){
            a[i] = sc.nextInt();
            b[i] = a[i];
        }
        sort(a);
    }
}
