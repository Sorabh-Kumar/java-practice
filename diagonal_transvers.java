import java.util.*;
public class Main {
    public static void diagonal(int[][] a) {
        int m = a.length;
        int n = a[0].length;
        for(int i =0; i<m; i++)
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); //row
        int n = sc.nextInt(); //colomn
        int[][] a = new int[m][n];
        for(int i = 0; i<m; i++){
            for(int j =0 ; j<n; j++){
                a[i][j] = sc.nextInt();
            }
        }
		diagonal(a);
    }
}