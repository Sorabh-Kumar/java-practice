import java.util.*;
public class calculate_sum {
	public static void sol(int[] a, int n){
		int l = a.length;
		int [] b = new int[l];
		for(int i=0; i<l; i++){
			b[i]= a[i];
		}
		for(int i =0; i<l; i++){
			int m =(i+(l-n))%l;
			a[i]= a[i] + b[m];
		}
		for(int v : a){
			System.out.print(v+" ");
		}
			System.out.println();
	}
	public static int sum(int[] a){
		int n = a.length;
		int sum = 0;
		for(int i=0; i<n; i++){
			sum = sum +  a[i];
		}
		return sum;
	}
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] n = new int[a];
        for(int i =0; i<a; i++){
            n[i]= sc.nextInt();
        }
		int q = sc.nextInt();
		for(int i =0; i <q; i++){
			int x = sc.nextInt();
			sol(n, x);
		}
		int s =sum(n);
		System.out.println(s);
		int x = s % (10^9+7);
		System.out.println(x);
    }
}