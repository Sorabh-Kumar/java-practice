import java.util.*;
public class pattern_mountain {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int t= n;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				System.out.print(j+"	");
			}
			for(int k=(t-1)*2-1; k>=1;k--){
				System.out.print(" 	");
			}
			t-=1;
			if(i==n){
				for(int x=i-1; x>=1;x--){
					System.out.print(x+"	");
			}}
			else{
				for(int x=i; x>=1; x--){
					System.out.print(x+"	");
				}
			}
		System.out.println();
		}
    }
}