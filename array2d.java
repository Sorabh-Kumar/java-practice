import java.util.Scanner;

public class array2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        for(int i = 0; i<n; i++){
            for(int j =0 ; j<m; j++){
                a[j][i] = sc.nextInt();
            }
        }
        for(int i = 0; i<n; i++){
            for(int j =0 ; j<m; j++){
                System.out.print(a[j][i]);
            }
            System.out.println();
        }
    }
}
