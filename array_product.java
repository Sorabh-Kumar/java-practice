import java.util.Scanner;

public class array_product {
    public static void so(int [] arr){
        int l = arr.length;
        for(int i =0; i<l; i++){
        int x = 1;
        int y = 1;
        for(int j =0; j<i; j++ ){
            x = x * arr[j];  
        }
        for(int k = i+1; k< l; k++ ){
            y = y * arr[k];
        }
        System.out.print(x*y+" ");     
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
