import java.util.Scanner;

public class wave_2d_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); //row
        int n = sc.nextInt(); //colomn
        int x = 1;
        int[][] a = new int[m][n];
        for(int i = 0; i<m; i++){
            for(int j =0 ; j<n; j++){
                a[i][j] = x++;  //sc.nextInt();
            }
        }
        for(int i = 0; i<m; i++){
            if(i%2==0){
            for(int j =0 ; j<n; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        else{
            for(int j =n-1 ; j>=0; j--){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    }
}