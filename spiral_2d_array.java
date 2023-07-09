import java.util.Scanner;

public class spiral_2d_array {
    public static void spiral(int[][] a, int m, int n){
        int sr, er, sc, ec;
        sr = 0;
        sc = 0;
        er = m-1;
        ec = n-1;
        while(sc<=ec&& sr <= er){
        for(int i =sc; i<= ec; i++){
            System.out.print(a[sr][i]+" ");
            //upper row
        }
        sr++;
        for(int i =sr; i<= er; i++){
            System.out.print(a[i][ec]+" ");
            //right row
        }
        ec--;
        if(sr<er){
        for(int i =ec; i>=sc; i--){
            System.out.print(a[er][i]+" ");
            //bottem row
        }
        er--;
        if(sc<ec){
        for(int i =er; i>=sr; i--){
            System.out.print(a[i][sc]+" ");
            //left row
        }
        sc++;
    }
    }
    }
    }
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
            for(int j =0 ; j<n; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        spiral(a, m, n);
    }
}