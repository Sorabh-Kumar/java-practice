import java.util.Scanner;

public class matrix_search {
    public static boolean sMatrix (int[][] a, int t) {
        int m = a.length;
        int n = a[0].length;
        int i = 0;
        int l = (m*n)- 1;
        int c =0;
        while(i<=l){
            int mid = l+i/2;
            int x= a[mid/n][mid%n];
            if(x==t)
                return true;
            else if(x>t )
                l = mid - 1;
            else
                i = mid+1;
    }
    return false;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m= sc.nextInt();
    int n= sc.nextInt();
    int[][] mat=  new int[m][n];
    for(int i = 0; i<m; i++){
        for(int j=0; j<n; j++){
            mat[i][j] = sc.nextInt();
        }
    }
    int target = 3;
    sMatrix(mat, target);
}
}
