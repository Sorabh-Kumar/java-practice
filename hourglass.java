import java.util.*;
public class hourglass {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<=n; i++){
			for(int s=1; s<=i; s++){
				System.out.print(" ");
			}
			for(int j=n-i; j>=0; j-- ){
				System.out.print(j);
			}
			for(int x=1; x<=n-i; x++){
				System.out.print(x);
			}
		System.out.println();
		}
		for(int i=1; i<=n; i++){
			for(int s=n-i; s>0;s--){
				System.out.print(" ");
			}
			for(int j= i; j>=0; j--){
				System.out.print(j);
			}
			for(int x=1; x<=i; x++){
				System.out.print(x);
			}
		System.out.println();
		}
    }
}