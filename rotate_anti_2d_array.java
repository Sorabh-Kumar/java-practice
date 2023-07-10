import java.util.Scanner;

public class rotate_anti_2d_array {
    public static void rotate(int[][] a) {
        
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); //row
        int y = 1;
        int[][] a = new int[m][m];
        for(int i = 0; i<m; i++){
            for(int j =0 ; j<m; j++){
                a[i][j] = y++;//sc.nextInt();
            }
        }
        for(int i = 0; i<m; i++){
            for(int j =0 ; j<m; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        rotate(a);
    }
}
