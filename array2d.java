import java.util.Scanner;

public class array2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); //row
        int n = sc.nextInt(); //colomn
        int[][] a = new int[m][n];
        for(int i = 0; i<m; i++){
            for(int j =0 ; j<n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<m; i++){
            for(int j =0 ; j<n; j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
