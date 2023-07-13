import java.util.*;
public class diagonal_transvers {
    public static void diagonal(int[][] a) {
        int m = a.length;
        int n = a[0].length;
        int r = 0;
        int c= 0;
        int i = 0; 
        int [] x = new int[m*n];
        boolean up = true;
        while(r<m && c<n){
            if(up){
                while(r>0&& c<n-1){
                x[i++] = a[r][c];
                r--;
                c++;}
                x[i++] = a[r][c];
                if(c==n-1){
                    r++;
                }
                else{
                    c++;
                }
            }
            else{
                while(r<m-1 && c>0){
                x[i++] = a[r][c];
                r++;
                c--;}
                x[i++] = a[r][c];
                if(r==m-1){
                    c++;
                }
                else{
                    r++;
                }
            }
            up = !up;
        }
        for(int z=0; z<(m*n); z++){
			System.out.print(x[z]+" ");
		}
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