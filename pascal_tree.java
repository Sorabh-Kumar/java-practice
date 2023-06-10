import java.util.*;
public class pascal_tree {
	public static int f(int n){
		int c =1;
		int s =1;
		while(s<=n){
			c*=s;
			s++;
		}
		return(c);
	}
	public static int pas(int i, int j){
		int p = f(i)/(f(i-j)*f(j));
		return(p);
	} 
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++){
			for(int j=1; j<=n-i; j++){
				System.out.print("  ");
			}
			for(int x=0; x<=i; x++){
				System.out.print(pas(i,x)+"   ");
			}
			System.out.println();
		}
    }
}