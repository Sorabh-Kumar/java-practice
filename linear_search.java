import java.util.*;
public class linear_search {
	public static int sol(int[] arr, int n){
        int l = arr.length;
        int c = 0;
        for(int i = 0; i<l; i++){
            if(arr[i]==n){
                System.out.println(i);
                c++;
            }
        }
        if(c==0){
            System.out.println(-1);
        }
    }
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i =0; i<n; i++){
            a[i] = sc.nextInt(); 
        }
		int m = sc.nextInt();
    }
}