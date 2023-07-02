import java.util.Scanner;

public class ramuArray {
    public static void sol(int[] a, int[] r, int[] c){
        int x=0 , y=0, r_c, c_c;
        int total = 0;
        for(int i = 0; i<r.length; i++ ){
            x = x+ Math.min((r[i]*a[0]),a[1]);
        }
        r_c = Math.min(x, a[2]);
        for(int i = 0; i<c.length; i++ ){
            y = y+ Math.min((c[i]*a[0]),a[1]);
        }
        c_c = Math.min(y, a[2]);
        total = r_c + c_c;
        System.out.println(Math.min(total, a[3]));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int x=0; x<test; x++){
        int[] a = new int[4];
        for(int i = 0; i<4; i++){
            a[i] = sc.nextInt();
            }
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] r = new int[n];
        int [] c = new int[m];
        for(int i = 0; i<n; i++){
            r[i] = sc.nextInt();
        }
        for(int i = 0; i<m; i++){
            c[i] = sc.nextInt();
        }
        sol(a, r, c);
        }
    }
}