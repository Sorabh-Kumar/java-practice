import java.util.Scanner;
public class rotate_2d_array {
    public static void rotate(int[][] a) {
        int m = a.length;
        int n = a[0].length;
        int[][] x = new int[n][m];
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                x[j][i] = a[i][j];
            }
        }
        for(int i = 0; i<n; i++){
            for(int j =0 ; j<m; j++){
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); //row
        int n = sc.nextInt(); //colomn
        int y = 1;
        int[][] a = new int[m][n];
        for(int i = 0; i<m; i++){
            for(int j =0 ; j<n; j++){
                a[i][j] = y++;//sc.nextInt();
            }
        }
        for(int i = 0; i<m; i++){
            for(int j =0 ; j<n; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        rotate(a);
    }
}
