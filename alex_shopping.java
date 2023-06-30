import java.util.Scanner;

public class alex_shopping {
    public static void sol(int m, int c, int[] a ){
        int l = a.length;
        int t = 0;
        for(int i = 0;  i<l; i++){
            if(m % a[i]==0){
                t++;
            }
        }
        if(t==c)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i =0; i<n; i++){
            a[i] = sc.nextInt(); 
        }
        int x = sc.nextInt();
        for(int i= 0; i<x; i++){
            int m = sc.nextInt();
            int c = sc.nextInt();
            sol(m, c, a);
        }
    }
}
