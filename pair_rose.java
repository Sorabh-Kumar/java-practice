import java.util.Scanner;
public class Main {
    public static void target(int[] a, int n){
        int l = 0;
        int r = a.length -1;
        int d_m = a[a.length -1];
        int f=0 , s=0;
        while(l<r){
            int sum = a[l] + a[r];
            if(sum > n){
                r--;
            }
            else if(sum < n){
                l++;
            }
            else{
                int d = r-l;
                if(d<d_m){
                    d_m = d;
                    f = a[l];
                    s = a[r];
                }
            }
        }
		System.out.println("Deepak should buy roses whose prices are"+f+" and " +s+"." );
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
        int test = sc.nextInt();
        for(int x=0; x<test; x++){
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
}