import java.util.*;
public class number_triangle {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c=0;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n-i; j++){
				System.out.print(" 	");
			}
			for(int m=1; m<=i; m++){
				int temp= i+m-1;
				System.out.print(temp+"	");
			}
			for(int x=1; x<i; x++){
				int temp= 2*i -(x +1);
				System.out.print(temp+"	");
			}
		System.out.println();
		}
    }
}