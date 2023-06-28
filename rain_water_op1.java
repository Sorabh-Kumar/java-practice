import java.util.Scanner;

public class rain_water_op1 {
    public static void so(int[] arr){
     int s = arr.length;
     int ans = 0;
     int[] a = new int[s];
     int r = arr[s-1];
     for(int i=s-1;i>=0;i-- ){
            r = Math.max(r, arr[i]);
            a[i] = r;
        }
     int l = arr[0];
     for(int i =0; i<s; i++){
        l = Math.max(l, arr[i]); 
     ans = ans+ Math.min(l, a[i]) - arr[i];
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
