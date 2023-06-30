import java.util.Scanner;

public class max_circular {
    public static void sol(int[] a){
        int l = a.length;
        int z = a[0];
        for(int j = 0; j<l; j++){
        int x = a[l-1];
        for(int i =l-1; i>0; i--){
            a[i]= a[i-1];
        }
        a[0] = x;
        int m = max_sum(a);
        if(m>z){
            m = z;
        }
    }
}
    public static int max_sum(int[] a){
        int l = a.length;
        int s = 0;
        int m = a[0];
        for(int i =0; i<l; i++){
            s = s+ a[i];
            if( s>m){
                m = s;
            }
        }
        return m;
    }
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		for(int i = 0; i<n; i++){
			int l = sc.nextInt();
			int[] a = new int[l];
        	for(int j =0; j<l; j++){
				a[j] = sc.nextInt();
            }
            sol(a);
		}
    }
}
