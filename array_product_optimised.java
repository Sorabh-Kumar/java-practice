import java.util.Scanner;

public class array_product_optimised {
    public static void so(int [] arr){
        int l = arr.length;
        int[] a = new int[l];
        int y = 1;
        for(int k = l-1; k>=0 ; k-- ){
            a[k] = y;
            y = y * arr[k];
        }

        for(int i =0; i<l; i++){
        int x = 1; 
        System.out.print(x * a[i] +" ");
        x = x * arr[i];     
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i =0; i<n; i++){
            a[i] = sc.nextInt(); 
        }
        so(a);
        sc.close();
    }
}