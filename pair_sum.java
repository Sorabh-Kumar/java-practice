import java.util.Scanner;

public class pair_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int[] a = new int[n];
        for(int z = 0; z<n; z++){
            a[z]= sc.nextInt();
        }
        for(int v: a){
            System.out.print(v+" ");
            System.out.println();
        }
        System.out.println("give sum of no. for ");
        int t = sc.nextInt();
        for(int i = 0; i<a.length; i++){
            int x = a[i];
            x = t -x;
            for(int j = i+1; j<a.length; j++ ){
                if(x== a[j]){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}
