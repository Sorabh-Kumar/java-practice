import java.util.*;
public class mirror_star {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = (n+1)/2;
		for(int i=1; i<=a;i++){
			for(int j=1; j<=a-i+1;j++){
				System.out.print(" 	");
			}
			for(int s=1; s<=2*i-1; s++){
				System.out.print("*	");
			}
			System.out.println();
			}
		for(int i= a-1; i>=1; i--){
			for(int j=1; j<=a-i+1;j++){
				System.out.print(" 	");
			}
			for(int s=1; s<=2*i-1; s++){
				System.out.print("*	");
			}
			System.out.println();
			
		}
	}
}
