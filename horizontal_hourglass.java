import java.util.*;
public class horizontal_hourglass {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int t =0;
		for(int i=0; i<=n; i++){
			for(int j=0; j<=i; j++){
				System.out.print(n-j+" ");
			}
			for(int k=(n-i)*2-1; k>=1;k-- ){
				System.out.print("  ");
			}
			if(i==n){
			for(int x=1; x<=n; x++)
				System.out.print(x+" ");
			}
			else{
			for(int x=0; x<=i; x++){
				t= (n-i)+x;
				System.out.print(t+" ");
			}}
		System.out.println();
		}
		for(int i=n-1; i>=0; i--){
			for(int j=0; j<=i; j++){
				System.out.print(n-j+" ");
			}
			for(int k=(n-i)*2-1; k>=1;k-- ){
				System.out.print("  ");
			}
			if(i==n){
			for(int x=1; x<=n; x++)
				System.out.print(x+" ");
			}
			else{
			for(int x=0; x<=i; x++){
				t= (n-i)+x;
				System.out.print(t+" ");
			}}
		System.out.println();
		}
    }
}