import java.util.Scanner;

public class target_sum_triplet {
    public static void target(int[] a, int n){
        int x = a.length;
        
        for(int i =0; i<x;i++ ){
            int l = i;
            int c = i+1;
            int r = x -1;
        while(c<r){
            int sum = a[c]+a[l] + a[r];
            if(sum > n){
                r--;
            }
            else if(sum < n){
                c++;
            }
            else{
                System.out.println(a[l]+", "+a[c]+" and "+a[r]);
                r--;
                c++;
            }
        }}
    }
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        sort(a);
        target(a, t);
    }
}