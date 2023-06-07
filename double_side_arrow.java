import java.util.*;
public class double_side_arrow {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int m= sc.nextInt();
		int n =(m+1)/2;
		for(int i= 1; i<=n; i++){
			for(int j=n-i; j>=1; j--){
				System.out.print("    ");
			}
			for(int k=i; k>=1;k--){
				System.out.print(k+" ");
			}
			for(int x=(i-1)*2-1;x>=1;x--){
				System.out.print("  ");
			}
			if(i!=1){
				for(int z=1; z<=i; z++){
					System.out.print(z+" ");
			}
			}
		System.out.println();
		}
		for(int i= n-1; i>=1; i--){
			for(int j=n-i; j>=1; j--){
				System.out.print("    ");
			}
			for(int k=i; k>=1;k--){
				System.out.print(k+" ");
			}
			for(int x=(i-1)*2-1;x>=1;x--){
				System.out.print("  ");
			}
			if(i!=1){
				for(int z=1; z<=i; z++){
					System.out.print(z+" ");
			}
			}
		System.out.println();
		}
    }
}