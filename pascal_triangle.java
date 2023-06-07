import java.util.*;
public class pascal_triangle {
	static int f(int n){
		int temp=1;
		for(int x=1; x<=n;x++)
			temp*=x;
		return(temp);
	}
	static int p(int i, int j){
		int t = f(i)/(f(i-j)*f(j));
		return(t);
	}
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=0; i<n; i++ ){
			for(int j=0; j<=i; j++){
				System.out.print(p(i,j)+"	");
				}
			System.out.println();
			}
		}
    }