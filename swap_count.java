import java.util.Scanner;

public class swap_count {
    public static void sort(int[] arr){
        int l = arr.length;
        for(int i = 1; i<l; i++){
            int p = arr[i];
            int j;
            for(j = i-1; j>=0 && arr[j]> p; j--){
                arr[j+1]= arr[j];   
            }
            arr[j+1] = p;
        }
    }
    public static void Swap(int[] a, int[] b){
        int c = 0;
        for(int i =0; i<a.length; i++){
            if(a[i]!= b[i])
                c++;
        }
        System.out.println(c/2);
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
        Swap(a, b);
    }
}
