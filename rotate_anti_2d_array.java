import java.util.Scanner;

public class rotate_anti_2d_array {
    public static void rotate(int[][] a) {
        int m =a.length;
        for(int i=0; i<m; i++){
            int s=0;
            int e=m-1;
            while(s<e){
                int temp = a[i][s];
                a[i][s] = a[i][e];
                a[i][e] = temp;
                s++;
                e--;
            }
        }
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
