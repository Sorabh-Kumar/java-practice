import java.util.Scanner;

public class rain_water {
    public static void so(int[] arr){
     int s = arr.length;
     int ans = 0;
     for(int i =0; i<s; i++){
        int l = arr[0];
        int r = arr[s-1];
        for(int j=0; j<=i; j++ ){
            l = Math.max(l, arr[j]); 
        }
        for(int j=i;j<s; j++ ){
            r = Math.max(l, arr[j]); 
        }
     ans= ans+ Math.min(l, r) - arr[i];
     }
     System.out.println(ans);
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
